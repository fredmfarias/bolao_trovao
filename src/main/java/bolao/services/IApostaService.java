package bolao.services;

import java.util.List;

import bolao.excecoes.ApostaException;
import bolao.model.Aposta;
import bolao.model.Jogo;
import bolao.model.Usuario;

public interface IApostaService {
	void addAposta(Usuario usuario, List<Jogo> jogos) throws ApostaException;
	List<Aposta> buscaApostasPorUsuario(Usuario usuario) throws ApostaException;
	List<Aposta> buscaApostasUsuarioComPontuacao(Usuario usuario) throws ApostaException;
	List<Aposta> buscaApostasUsuarioExibPorNumJogo(Usuario usuario) throws ApostaException;
	List<Aposta> buscaApostasPorJogo(Jogo jogo) throws ApostaException;
	void salvaListAposta(List<Aposta> apostas) throws ApostaException;
	void calculaPontuacao(Aposta aposta);
}
