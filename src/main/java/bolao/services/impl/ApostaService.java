package bolao.services.impl;

import java.io.Serializable;
import java.util.Date;
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
import bolao.services.IBolaoService;
import bolao.services.IJogoService;
import bolao.util.Constantes;

@Transactional(readOnly=true)
@Service("apostaService")
public class ApostaService implements IApostaService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ApostaDAO apostaDAO;
	
	@Autowired
	private IBolaoService bolaoService;
	
	@Autowired
	private IJogoService jogoService;
	
	@Override
	@Transactional(readOnly=false)
	public void addAposta(Usuario usuario, List<Jogo> jogos) throws ApostaException{
		
		for(Jogo j : jogos){
			Aposta aposta = new Aposta();
			
			aposta.setUsuario(usuario);
			aposta.setJogo(j);
			aposta.atualizaSituacao();
			
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
	@Transactional(readOnly=false)
	public void salvaListAposta(List<Aposta> apostas) throws ApostaException {
		
		if(!this.bolaoService.permiteAposta()){
			throw new ApostaException("Prazo de aposta ultrapassado.");
		}
		
		try{
			for(Aposta a : apostas){
				this.apostaDAO.atualizar(a);
			}
		}catch(Exception e){
			throw new ApostaException("Nao foi possivel atualizar as apostas do usuario");
		}
	}

	@Override
	public List<Aposta> buscaApostasPorJogo(Jogo jogo) throws ApostaException {
		try{
			return this.apostaDAO.buscaAPostasPorJogo(jogo.getId());
		}catch(NullPointerException e){
			throw new ApostaException("Erro ao buscar apostas, jogo nulo");
		}catch (Exception e) {
			throw new ApostaException("Nao foi possivel recuperar as apostas do jogo");
		}
	}
	
	public void calculaPontuacao(Aposta aposta){
		
		if(aposta == null || aposta.getJogo() == null){
			throw new NullPointerException("Aposta ou jogo nao pode ser nulo");
		}
		
		// variaveis que armazena placar do time de casa e visitante
		Integer pc = aposta.getJogo().getPlacarCasa();
		Integer pv = aposta.getJogo().getPlacarVisitante();

		// variaveis que armazena apostas do time de casa e visitante
		Integer ac = aposta.getApostaPlacarCasa();
		Integer av = aposta.getApostaPlacarVisitante();

		// logica da pontuacao
		if ((pc == null) || (pv == null) || (ac == null) || (av == null)) {
			aposta.setPontuacao(
					Constantes.PONTUACAO_AN * aposta.getJogo().getPesoPontucao());
		} else if ((ac > av && pc < pv) || (ac < av && pc > pv)
				|| (ac == av && pc != pv) || (ac != av && pc == pv)) {
			// Se nao houver acerto de nada
			aposta.setPontuacao(
					Constantes.PONTUACAO_AN * aposta.getJogo().getPesoPontucao());
		} else if ((ac > av && pc > pv && ac != pc && av != pv)
				|| (ac < av && pc < pv && ac != pc && av != pv)) {
			// Se acertar o ganhador do jogo
			aposta.setPontuacao(
					Constantes.PONTUACAO_AG * aposta.getJogo().getPesoPontucao());
		} else if ((ac > av && pc > pv && ac != pc && av == pv)
				|| (ac < av && pc < pv && ac == pc && av != pv)) {
			// Se acertar o placar do perdedor do jogo
			aposta.setPontuacao(
					Constantes.PONTUACAO_APP * aposta.getJogo().getPesoPontucao());
		} else if ((ac > av && pc > pv && ac == pc && av != pv)
				|| (ac < av && pc < pv && ac != pc && av == pv)) {
			// Se acertar o placar o vencedor do jogo
			aposta.setPontuacao(
					Constantes.PONTUACAO_APG * aposta.getJogo().getPesoPontucao());
		} else if (ac == pc && av == pv) {
			// Se acertar o placar do jogo
			aposta.setPontuacao(
					Constantes.PONTUACAO_AP * aposta.getJogo().getPesoPontucao());
		} else if (ac == av && pc == pv && ac != pc) {
			// Se acertar que o jogo eh empate, mas com placar diferente
			aposta.setPontuacao(
					Constantes.PONTUACAO_AE * aposta.getJogo().getPesoPontucao());
		}
	}

	@Override
	public List<Aposta> buscaApostasUsuarioComPontuacao(Usuario usuario)
			throws ApostaException {
		try{
			return this.apostaDAO.buscaApostasUsuarioComPontuacao(usuario.getId());
		}catch(NullPointerException e){
			throw new ApostaException("Erro ao buscar apostas, Usuario nulo");
		}catch (Exception e) {
			throw new ApostaException("Nao foi possivel recuperar as apostas do usuario");
		}
	}

	@Override
	public List<Aposta> buscaApostasUsuarioExibPorNumJogo(Usuario usuario)
			throws ApostaException {
		try{
			return this.apostaDAO
					.buscaApostasUsuarioExibPorNumJogo(usuario.getId());
		}catch(NullPointerException e){
			throw new ApostaException("Erro ao buscar apostas, Usuario nulo");
		}catch (Exception e) {
			throw new ApostaException("Nao foi possivel recuperar as apostas do usuario");
		}
	}

	@Override
	public List<Aposta> buscaApostasUsuarioComPontuacao(Usuario usuario,
			List<Jogo> jogos) throws ApostaException {
		try{
			return this.apostaDAO.buscaApostasUsuarioComPontuacao(usuario.getId(), jogos);
		}catch(NullPointerException e){
			throw new ApostaException("Erro ao buscar apostas, Usuario nulo");
		}catch (Exception e) {
			throw new ApostaException("Nao foi possivel recuperar as apostas do usuario");
		}
	}

	@Override
	public void addAposta(Aposta aposta) throws ApostaException {
		try{
			this.apostaDAO.salvar(aposta);
		}catch (Exception e) {
			throw new ApostaException("Nao foi adcionar aposta");
		}		
	}

	@Override
	@Transactional(readOnly=false)
	public Aposta salva(Aposta aposta) throws ApostaException {
		
		try{
			if(!this.jogoService.permiteAposta(aposta.getJogo())){
				throw new ApostaException(String.format("Prazo de aposta para o jogo long %s ultrapassado.", aposta.getJogo().getNumeroJogo()));
			}
		
			aposta.setUltimaAtualizacao(new Date());
			
			this.apostaDAO.atualizar(aposta);
		}catch(Exception e){
			throw new ApostaException("Nao foi possivel atualiza a aposta do usuario");
		}
		
		return aposta;
	}
}