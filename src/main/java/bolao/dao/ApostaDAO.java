package bolao.dao;

import java.util.List;

import bolao.model.Aposta;

public interface ApostaDAO extends DAOBase<Aposta>{
	List<Aposta> buscaApostasPorUsuario(Long id_usuario);
}
