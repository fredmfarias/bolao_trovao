package bolao.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.dao.JogoDAO;
import bolao.model.Jogo;
import bolao.services.IJogoService;

@Transactional(readOnly=true)
@Service("jogoService")
public class JogoService implements IJogoService {
	
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

}
