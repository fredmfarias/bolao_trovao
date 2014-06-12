package bolao.services;

import java.util.Date;
import java.util.List;

import bolao.excecoes.JogoException;
import bolao.model.Jogo;

public interface IJogoService {
	List<Jogo> getAllJogos();
	List<Date> getAllDatasJogos();
	void atualizaJogo(Jogo jogo) throws JogoException;
}
