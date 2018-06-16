package bolao.services;

import java.util.Date;
import java.util.List;

import bolao.excecoes.JogoException;
import bolao.model.Jogo;

public interface IJogoService {
	List<Jogo> getAllJogos();
	List<Date> getAllDatasJogos();
	List<Jogo> buscaTodosJogosComPlacar() throws JogoException;
	void atualizaJogo(Jogo jogo) throws JogoException;
	Jogo buscar(Jogo jogo) throws JogoException;
	void adcionaJogo(Jogo jogo) throws JogoException;
	boolean permiteAposta(Jogo jogo) throws JogoException;
	List<Jogo> buscaTodosJogosExibiveis() throws JogoException;
}
