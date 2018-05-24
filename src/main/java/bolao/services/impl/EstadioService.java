package bolao.services.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.dao.EstadioDAO;
import bolao.excecoes.EstadioException;
import bolao.model.Estadio;
import bolao.services.IEstadioService;

@Transactional(readOnly=true)
@Service(value="estadioService")
public class EstadioService implements IEstadioService, Serializable{

	private static final long serialVersionUID = 1L;

	@Autowired
	private EstadioDAO estadioDAO;
	
	@Override
	public List<Estadio> getAllEstadios() throws EstadioException {
		try{
			return this.estadioDAO.listAll();
		}catch(Exception e){
			throw new EstadioException("Nao foi possivel buscar Estadios");
		} 
	}
}