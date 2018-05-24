package bolao.services;

import java.util.List;

import bolao.excecoes.EstadioException;
import bolao.model.Estadio;

public interface IEstadioService {

	List<Estadio> getAllEstadios() throws EstadioException;
}
