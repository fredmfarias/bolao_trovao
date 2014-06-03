package bolao.services.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.dao.ApostaDAO;
import bolao.excecoes.ApostaException;
import bolao.model.Aposta;
import bolao.model.Jogo;
import bolao.model.Usuario;
import bolao.services.IApostaService;

@Transactional(readOnly=true)
@Service("apostaService")
public class ApostaService implements IApostaService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ApostaDAO apostaDAO;
	
	@Override
	@Transactional(readOnly=false)
	public void addAposta(Usuario usuario, List<Jogo> jogos) throws ApostaException{
		
		for(Jogo j : jogos){
			Aposta aposta = new Aposta();
			
			aposta.setUsuario(usuario);
			aposta.setJogo(j);
			
			this.apostaDAO.salvar(aposta);
		}
	}

	@Override
	public List<Aposta> buscaApostasPorUsuario(Usuario usuario)
			throws ApostaException {
		try{
			return this.apostaDAO.buscaApostasPorUsuario(usuario.getId());
		}catch(NullPointerException e){
			throw new ApostaException("Erro ao buscar apostas, Usuario nulo");
		}catch (Exception e) {
			throw new ApostaException("Nao foi possivel recuperar as apostas do usuario");
		}
	}

	@Override
	public void salvaListAposta(List<Aposta> apostas) throws ApostaException {
		
		try{
			for(Aposta a : apostas){
				this.apostaDAO.atualizar(a);
			}
		}catch(Exception e){
			throw new ApostaException("Nao foi possivel atualizar as apostas do usuario");
		}
	}
}
