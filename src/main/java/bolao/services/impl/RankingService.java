package bolao.services.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.dao.RankingDAO;
import bolao.excecoes.ApostaException;
import bolao.excecoes.RankingException;
import bolao.excecoes.UsuarioException;
import bolao.model.Aposta;
import bolao.model.Ranking;
import bolao.model.Usuario;
import bolao.services.IApostaService;
import bolao.services.IRankingService;
import bolao.services.IUsuarioService;
import bolao.util.Constantes;

@Transactional(readOnly = true)
@Service("rankingService")
public class RankingService implements IRankingService, Serializable {

	private static final long serialVersionUID = 56577296642923927L;

	@Autowired
	IUsuarioService usuarioService;
	
	@Autowired
	IApostaService apostaService;
	
	@Autowired
	RankingDAO rankingDAO;
	
	private Ranking geraRankingUsuario(List<Aposta> apostas) {
		
		Ranking ranking = new Ranking();
				
		for(Aposta a : apostas){
			
			ranking.addPontuacao(a.getPontuacao());
			
			if ((a.getPontuacao() == Constantes.PONTUACAO_AP) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_AP * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosPlacarJogo();
			}else if((a.getPontuacao() == Constantes.PONTUACAO_APG) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_APG * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosPlacarVencedorJogo();
			}else if(((a.getPontuacao() == Constantes.PONTUACAO_APP) && (a.getJogo().getPesoPontucao() == 1) ) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_APP * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosPlacarPerdedorJogo();
			}else if((a.getPontuacao() == Constantes.PONTUACAO_AE) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_AE * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosEmpateJogo();
			}else if((a.getPontuacao() == Constantes.PONTUACAO_AG) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_AG * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosGanhador();
			}else if((a.getPontuacao() == Constantes.PONTUACAO_AN) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_AN * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosNada();
			}
		}
		
		return ranking;
	}

	private void geraPosicaoRanking(List<Ranking> rankings) {
		Collections.sort(rankings);
		
		for(int i=0; i<rankings.size(); i++){
			rankings.get(i).setPosicao(i+1);
		}
	}

	@Override
	public List<Ranking> geraRankingGeral() throws RankingException{
		
		List<Usuario> usuarios;
		try {
			usuarios = this.usuarioService.buscaUsuariosAtivos();
		} catch (UsuarioException e) {
			throw new RankingException("Erro ao gerar ranking. Nao buscou os usuarios");
		}
		
		List<Ranking> rankings = new ArrayList<Ranking>();
		
		int ultimaParcial = ultimaParcialPostada();
		
		for(Usuario u : usuarios){
			
			Ranking ranking;
			
			try {
				ranking = this.geraRankingUsuario(
						this.apostaService.buscaApostasUsuarioComPontuacao(u));
			} catch (ApostaException e) {
				throw new RankingException("Erro ao gerar ranking. Nao buscou apostas dos usuarios");
			}
			
			ranking.setParcialPostada(ultimaParcial + 1);
						
			ranking.setUsuario(u);
			
			rankings.add(ranking);
		}
		
		//Ordem de chamada deve ser essa
		geraPosicaoRanking(rankings);
		geraPosicoesGanhas(ultimaParcial, rankings);
		
		return rankings;
	}
	
	private void geraPosicoesGanhas(int ultimaParcial, List<Ranking> rankings){
		for(Ranking r : rankings){
			int ultimaPosicao = posicaoRanking(ultimaParcial, r.getUsuario());
			
			if(ultimaPosicao == 0){
				r.setPosicoesGanhas(0);
			}else{
				r.setPosicoesGanhas(ultimaPosicao - r.getPosicao());
			}
		}
	}
	
	public int ultimaParcialPostada() throws RankingException{
		try{
			Integer maxParcial = this.rankingDAO.maxParcialPostada();
			return maxParcial == null ? 0 : maxParcial;
		}catch(Exception e){
			throw new RankingException("Falha ao buscar ultima parcial postada");
		}
	}
	
	private int posicaoRanking(int parcial, Usuario usuario){
		Integer posicaoRanking = this.rankingDAO.posicaoRanking(parcial, usuario);
		return posicaoRanking == null ? 0 : posicaoRanking;
	}
	
	@Transactional(readOnly = false)
	public void salvarRanking(List<Ranking> rankings) throws RankingException{
		try{
			for(Ranking r : rankings){
				this.rankingDAO.salvar(r);
			}
		}catch(Exception e){
			throw new RankingException("Falha ao salvar ranking");
		}
	}

	@Override
	public List<Ranking> buscarRankingPorParcial(int parcial)
			throws RankingException {
		try{
			return this.rankingDAO.buscarRankingPorParcial(parcial);
		}catch(Exception e){
			throw new RankingException("Falha ao buscar ranking");
		}
	}

	@Override
	public List<Integer> buscarParciais() throws RankingException {
		try{
			return this.rankingDAO.buscarParciais();
		}catch(Exception e){
			throw new RankingException("Falha ao buscar numero de parciais");
		}
	}
}