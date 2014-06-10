package bolao.dao;

import java.util.Date;
import java.util.List;

import bolao.model.Jogo;

public interface JogoDAO extends DAOBase<Jogo> {
	List<Date> datasJogos();
}
