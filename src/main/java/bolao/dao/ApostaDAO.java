package bolao.dao;

import java.util.List;

import bolao.model.Aposta;
import bolao.model.Jogo;

public interface ApostaDAO extends DAOBase<Aposta>{
	List<Aposta> buscaApostasPorUsuario(Long id_usuario);
	List<Aposta> buscaApostasUsuarioComPontuacao(Long id_usuario);
	List<Aposta> buscaApostasUsuarioComPontuacao(Long id_usuario, List<Jogo> jogos);
	List<Aposta> buscaAPostasPorJogo(Integer id_jogo);
	List<Aposta> buscaApostasUsuarioExibPorNumJogo(Long id_usuario);
}
