package bolao.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.web.WebAttributes;

public class MensagensPhaseListener implements PhaseListener{

    private static final long serialVersionUID = 1L;

    @Override
    public void afterPhase(PhaseEvent phaseEvent) {}

    public void beforePhase(PhaseEvent phaseEvent){
			
		//Captura excecoes do Spring
		Exception dadosIncorretosException = (Exception) FacesUtil.getSessionMap().get(WebAttributes.AUTHENTICATION_EXCEPTION);
		
        if(dadosIncorretosException instanceof BadCredentialsException) {
            FacesUtil.getSessionMap().put(WebAttributes.AUTHENTICATION_EXCEPTION, null);
            MessagesProperty.errorMsg("MN0008");
		}else if(dadosIncorretosException instanceof LockedException){
		    FacesUtil.getSessionMap().put(WebAttributes.AUTHENTICATION_EXCEPTION, null);
		    MessagesProperty.errorMsg("MN0009");
		}
		else if(dadosIncorretosException instanceof DisabledException){
        	FacesUtil.getSessionMap().put(WebAttributes.AUTHENTICATION_EXCEPTION, null);
            MessagesProperty.errorMsg("MN0010");
        }

    }

    @Override
    public PhaseId getPhaseId() {
	return PhaseId.ANY_PHASE;
    }

}
