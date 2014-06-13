package bolao.dao;

import java.util.List;

public interface DAOBase<T> {
	
	public List<T> listAll();
	
	public void salvar(T objeto);
	
	public void atualizar(T objeto);
	
	public void excluir(T objeto);
	
	public T getOne(Integer id);
	
}
