package bolao.apresentacao.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import bolao.util.DataUtil;

@ManagedBean(name="utilMB")
@RequestScoped
public class UtilMB {
	
	public DataUtil getDataUtil(){
		return DataUtil.getInstance();
	}
}
