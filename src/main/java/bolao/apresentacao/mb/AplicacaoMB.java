package bolao.apresentacao.mb;

import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import bolao.util.DataUtil;
import bolao.util.PrimeFacesUtil;

@ManagedBean(name = "aplicacaoMB")
@ApplicationScoped
public class AplicacaoMB {

	private final int DIA = 03;
	private final int MES = 06;
	private final int ANO = 2014;
	private final int HORA = 17;
	private final int MIN = 00;

	public Date getDataAtual() {
		return new Date();
	}

	public int getDia() {
		return DIA;
	}

	public int getMes() {
		return MES;
	}

	public int getAno() {
		return ANO;
	}

	public int getHora() {
		return HORA;
	}

	public int getMin() {
		return MIN;
	}
	
	public void cronometroRegressivo(){
		String script = "atualizaContador(" + ANO + ", " + MES 
				+ ", " + DIA + ", " + HORA + ", " + MIN + ", 'elemento')";
		PrimeFacesUtil.executeJavaScript(script);
	}
	
	public Date dataLimiteAposta(){
		return DataUtil.obterData(DIA, MES, ANO, HORA, MIN);
	}
}