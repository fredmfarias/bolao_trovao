package bolao.mb;

import javax.faces.bean.ManagedBean;

import org.hibernate.Session;

import bolao.util.HibernateUtil;

@ManagedBean(name="homeMB")
public class HomeMB {

	public String teste(){
		Session sessao = null;
		
		try{
			sessao = HibernateUtil.getSessionFactory().openSession();
			System.out.println("COnectou!");
		}finally{
			sessao.close();
		}
		return "conectou!";
	}
}