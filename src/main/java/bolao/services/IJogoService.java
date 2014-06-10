package bolao.services;

import java.util.Date;
import java.util.List;

import bolao.model.Jogo;

public interface IJogoService {
	List<Jogo> getAllJogos();
	List<Date> getAllDatasJogos();
}
