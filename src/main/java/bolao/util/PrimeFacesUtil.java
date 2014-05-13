package bolao.util;

import org.primefaces.component.dialog.Dialog;
import org.primefaces.context.RequestContext;

public class PrimeFacesUtil {
	private PrimeFacesUtil() {
		super();
	}

	public static void executeJavaScript(String script) {
		RequestContext requestContext = RequestContext.getCurrentInstance();
		executeJavaScript(requestContext, script);
	}

	public static void executeJavaScript(RequestContext requestContext,
			String script) {
		requestContext.execute(script);
	}

	public static void showDialog(Dialog dialog) {
		RequestContext requestContext = RequestContext.getCurrentInstance();
		showDialog(requestContext, dialog);
	}

	public static void showDialog(RequestContext requestContext, Dialog dialog) {
		showDialog(requestContext, dialog.resolveWidgetVar());
	}

	public static void showDialog(String dialogWidgetVar) {
		RequestContext requestContext = RequestContext.getCurrentInstance();
		showDialog(requestContext, dialogWidgetVar);
	}

	public static void showDialog(RequestContext requestContext,
			String dialogWidgetVar) {
		executeJavaScript(requestContext, dialogWidgetVar + ".show()");
	}

	public static void hideDialog(Dialog dialog) {
		RequestContext requestContext = RequestContext.getCurrentInstance();
		hideDialog(requestContext, dialog);
	}

	public static void hideDialog(RequestContext requestContext, Dialog dialog) {
		hideDialog(requestContext, dialog.resolveWidgetVar());
	}

	public static void hideDialog(String dialogWidgetVar) {
		RequestContext requestContext = RequestContext.getCurrentInstance();
		hideDialog(requestContext, dialogWidgetVar);
	}

	public static void hideDialog(RequestContext requestContext,
			String dialogWidgetVar) {
		executeJavaScript(requestContext, dialogWidgetVar + ".hide()");
	}
}
