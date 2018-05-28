package bolao.services.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.dao.JogoDAO;
import bolao.excecoes.ApostaException;
import bolao.excecoes.JogoException;
import bolao.model.Aposta;
import bolao.model.Jogo;
import bolao.model.Usuario;
import bolao.services.IApostaService;
import bolao.services.IJogoService;
import bolao.services.IUsuarioService;
import bolao.util.Constantes;
import bolao.util.DataUtil;

@Transactional(readOnly=true)
@Service("jogoService")
public class JogoService implements IJogoService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	JogoDAO jogoDAO;
	
	@Autowired
	IApostaService apostaService;
	
	@Autowired
	IUsuarioService usuarioService;
	
	@Override
	public List<Jogo> getAllJogos() {
		return getJogoDAO().listAll();
	}

	public JogoDAO getJogoDAO() {
		return jogoDAO;
	}

	public void setJogoDAO(JogoDAO jogoDAO) {
		this.jogoDAO = jogoDAO;
	}

	@Override
	public List<Date> getAllDatasJogos() {
		return getJogoDAO().datasJogos();
	}

	@Override
	@Transactional(readOnly=false)
	public void atualizaJogo(Jogo jogo) throws JogoException {
		
		if(jogo == null || jogo.getId() == null){
			throw new JogoException("Impossivel atualizar o jogo, nulo ou sem referencia");
		}
		
		Jogo jogoAntigo = this.buscar(jogo);
		
		if(jogoAntigo == null){
			throw new JogoException("Jogo nao encontrado");
		}
		
		boolean mudouPlacar = jogoDiferePlacar(jogo, jogoAntigo);
		
		this.jogoDAO.merge(jogo);
		
		if(mudouPlacar){
			try {
				List<Aposta> apostas = this.apostaService.buscaApostasPorJogo(jogo);
				
				for(Aposta a : apostas){
					this.apostaService.calculaPontuacao(a);
				}
			} catch (ApostaException e) {
				throw new JogoException("Nao foi possivel buscar as apostas do jogo.", e);
			}
		}
		
	}
	
	@Override
	@Transactional(readOnly=false)
	public void adcionaJogo(Jogo jogo) throws JogoException {
		
		if(jogo == null){
			throw new JogoException("Impossivel adcionar, jogo nulo");
		}
		
		this.jogoDAO.salvar(jogo);
				
		try {
			List<Usuario> usuarios = this.usuarioService.getAllUsuarios();
				
			for(Usuario u : usuarios){
				Aposta aposta = new Aposta();
				
				aposta.setJogo(jogo);
				aposta.setUsuario(u);
								
				this.apostaService.addAposta(aposta);
			}
		}catch (ApostaException e) {
			throw new JogoException("Nao foi possivel adcionar aposta do jogo.", e);
		}catch(Exception e){
			throw new JogoException("Nao foi possivel adcionar jogo.", e);
		}
	}
	
	private boolean jogoDiferePlacar(Jogo jogo1, Jogo jogo2){
		return (jogo1.getPlacarCasa() !=null && 
					!jogo1.getPlacarCasa().equals(jogo2.getPlacarCasa()))
				|| (jogo1.getPlacarVisitante() != null && 
					!jogo1.getPlacarVisitante().equals(jogo2.getPlacarVisitante()));
	}

	@Override
	public Jogo buscar(Jogo jogo) throws JogoException {
		try{
			return this.jogoDAO.getOne(jogo.getId()); 
		}catch(Exception e){
			throw new JogoException("Falha ao buscar jogo");
		}
	}

	@Override
	public List<Jogo> buscaTodosJogosComPlacar() throws JogoException {
		try{
			return this.jogoDAO.buscaTodosJogosComPlacar();
		}catch(Exception e){
			throw new JogoException("Falha ao buscar jogos");
		}
	}

	@Override
	public boolean permiteAposta(Jogo jogo) throws JogoException{
		
		long diff = DataUtil.diffMinutes(new Date(), jogo.getDataJogo());
		
		if(diff < Constantes.MINUTOS_ANTES_PERMITE_APOSTA) {
			return false;
		}
		
		return true;
	}
}