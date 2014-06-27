package bolao.services.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.dao.ClubeDAO;
import bolao.excecoes.ClubeException;
import bolao.model.Clube;
import bolao.services.IClubeService;

@Transactional(readOnly=true)
@Service(value="clubeService")
public class ClubeService implements IClubeService, Serializable{

	private static final long serialVersionUID = 2725119223249891535L;

	@Autowired
	private ClubeDAO clubeDAO;
	
	@Override
	public List<Clube> getAllClubes() throws ClubeException {
		try{
			return this.clubeDAO.listAll();
		}catch(Exception e){
			throw new ClubeException("Nao foi possivel buscar clubes");
		} 
	}
}