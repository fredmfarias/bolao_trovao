package bolao.services.impl;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.services.IBolaoService;
import bolao.util.DataUtil;

@Transactional(readOnly=true)
@Service("bolaoService")
public class BolaoService implements IBolaoService, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1870079055351517970L;
	
	public static final int DIA = 14;
	public static final int MES = 11;
	public static final int ANO = 2022;
	public static final int HORA = 10;
	public static final int MIN = 00;
	
	public boolean permiteAposta() {
		return !DataUtil.isDataAnterior(dataLimiteAposta());
	}
	
	public Date dataLimiteAposta(){
		return DataUtil.obterData(DIA, MES, ANO, HORA, MIN);
	}

}
