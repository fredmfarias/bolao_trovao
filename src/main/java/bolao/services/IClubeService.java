package bolao.services;

import java.util.List;

import bolao.excecoes.ClubeException;
import bolao.model.Clube;

public interface IClubeService {
	List<Clube> getAllClubes() throws ClubeException;
}
