package bolao.services.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.dao.RankingDetalhadoDAO;
import bolao.excecoes.ApostaException;
import bolao.excecoes.RankingException;
import bolao.excecoes.UsuarioException;
import bolao.model.Aposta;
import bolao.model.Jogo;
import bolao.model.RankingDetalhado;
import bolao.model.Usuario;
import bolao.services.IApostaService;
import bolao.services.IRankingDetalhadoService;
import bolao.services.IUsuarioService;

@Transactional(readOnly = true)
@Service("rankingDetalhadoService")
public class RankingDetalhadoService implements IRankingDetalhadoService, Serializable {

	private static final long serialVersionUID = -4253819765053847774L;

	@Autowired
	IUsuarioService usuarioService;
	
	@Autowired
	IApostaService apostaService;
	
	@Autowired
	RankingDetalhadoDAO rankingDetalhadoDAO;
	
	private RankingDetalhado geraRankingUsuario(List<Aposta> apostas) {
		
		RankingDetalhado rankingDetalhado = new RankingDetalhado();
				
		for(Aposta a : apostas){
			
			rankingDetalhado.addPontuacao(a.getPontuacao());
			rankingDetalhado.addAposta(a);
		}
				
		return rankingDetalhado;
	}

	private void geraPosicaoRanking(List<RankingDetalhado> rankings) {
		Collections.sort(rankings);
		
		for(int i=0; i<rankings.size(); i++){
			rankings.get(i).setPosicao(i+1);
		}
	}

	@Override
	public List<RankingDetalhado> geraRankingDetalhado(List<Jogo> jogos) throws RankingException{
		
		List<Usuario> usuarios;
		try {
			usuarios = this.usuarioService.buscaUsuariosAtivos();
		} catch (UsuarioException e) {
			throw new RankingException("Erro ao gerar ranking. Nao buscou os usuarios");
		}
		
		List<RankingDetalhado> rankings = new ArrayList<RankingDetalhado>();
		
		int ultimaParcial = ultimaParcialPostada();
		
		for(Usuario u : usuarios){
			
			RankingDetalhado ranking;
			
			try {
				ranking = this.geraRankingUsuario(
						this.apostaService.buscaApostasUsuarioComPontuacao(u, jogos));
			} catch (ApostaException e) {
				throw new RankingException("Erro ao gerar ranking. Nao buscou apostas dos usuarios");
			}
			
			ranking.setParcialPostada(ultimaParcial + 1);
						
			ranking.setUsuario(u);
			
			rankings.add(ranking);
		}
		
		//Ordem de chamada deve ser essa
		geraPosicaoRanking(rankings);
		
		return rankings;
	}
		
	public int ultimaParcialPostada() throws RankingException{
		try{
			Integer maxParcial = this.rankingDetalhadoDAO.maxParcialPostada();
			return maxParcial == null ? 0 : maxParcial;
		}catch(Exception e){
			throw new RankingException("Falha ao buscar ultima parcial postada");
		}
	}
		
	@Transactional(readOnly = false)
	public void salvarRankingDetalhado(List<RankingDetalhado> rankings) throws RankingException{
		try{
			for(RankingDetalhado r : rankings){
				this.rankingDetalhadoDAO.salvar(r);
			}
		}catch(Exception e){
			throw new RankingException("Falha ao salvar ranking");
		}
	}

	@Override
	public List<RankingDetalhado> buscarRankingDetalhadoPorParcial(int parcial)
			throws RankingException {
		try{
			return this.rankingDetalhadoDAO.buscarRankingDetalhadoPorParcial(parcial);
		}catch(Exception e){
			throw new RankingException("Falha ao buscar ranking");
		}
	}

	@Override
	public List<Integer> buscarParciais() throws RankingException {
		try{
			return this.rankingDetalhadoDAO.buscarParciais();
		}catch(Exception e){
			throw new RankingException("Falha ao buscar numero de parciais");
		}
	}

}