package bolao.services.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.dao.JogoDAO;
import bolao.model.Jogo;
import bolao.services.IJogoService;

@Transactional(readOnly=true)
@Service("jogoService")
public class JogoService implements IJogoService, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	JogoDAO jogoDAO;
	
	@Override
	public List<Jogo> getAllJogos() {
		return getJogoDAO().listAll();
	}

	public JogoDAO getJogoDAO() {
		return jogoDAO;
	}

	public void setJogoDAO(JogoDAO jogoDAO) {
		this.jogoDAO = jogoDAO;
	}

	@Override
	public List<Date> getAllDatasJogos() {
		return getJogoDAO().datasJogos();
	}

}
