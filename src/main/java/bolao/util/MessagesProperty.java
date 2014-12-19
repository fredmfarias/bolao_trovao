package bolao.util;

import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

public class MessagesProperty {

	/**
	 * Nome do arquivo de properties.
	 */
	private static final String RESOURCE_FILE_BASE = "messages_pt_BR";

	private static ResourceBundle bundle = ResourceBundle.getBundle(RESOURCE_FILE_BASE);
	
	/**
	 * Recupera uma mensagem do arquivo de properties.
	 * 
	 * @param key
	 *            A chave da propriedade.
	 * @return O valor da propriedade.
	 */
	public static String getMessage(String key) {
	    return bundle.getString(key);
	}
	
	/**
	 * Recupera uma mensagem do arquivo de properties.
	 * @param baseName O nome do resource file.
	 * @param key A chave da propriedade.
	 * @return O valor da propriedade.
	 */
	public static String getMessage(String baseName, String key) {
	    bundle = ResourceBundle.getBundle(baseName);
	    return bundle.getString(key);
	}
	
	public static String getMessageReplace(String key, String... values){		
		String line = bundle.getString(key);
	    Pattern pattern = Pattern.compile("\\{[0-9]{1,4}\\}");
	    Matcher matcher = pattern.matcher(line);
	    String resultLine = "";
		
	    for (String param : values) {
		resultLine = matcher.replaceFirst(param);
		matcher = pattern.matcher(resultLine);
	    }
	    
	    return resultLine;
	}

	
	private static void msg(Severity severity, String id, String sumario, String detalhe){
	    
	    if (!sumario.equals("Sucesso!") 
		    && !sumario.equals("Alerta!")
		    && !sumario.equals("Erro!")) {
	    	sumario = bundle.getString(sumario);
	    } else {
		sumario = "";//para voltar a aparecer as mensagens "Sucesso!", "Alerta!" e "Erro!" basta apenas comentar o "else"
	    }
	    
	    detalhe = bundle.getString(detalhe);
	    FacesMessage fm = new FacesMessage(severity, sumario, detalhe);
	    FacesContext fc = FacesContext.getCurrentInstance();
	    fc.addMessage(id, fm);
	    
	}
	
	private static void msgReplace(Severity severity, String id, String sumario, String detalhe, String... values) {
	    
	    if (!sumario.equals("Sucesso!") 
		    && !sumario.equals("Alerta!")
		    && !sumario.equals("Erro!")) {
		sumario = bundle.getString(sumario);
	    } else {
		sumario = "";//para voltar a aparecer as mensagens "Sucesso!", "Alerta!" e "Erro!" basta apenas comentar o "else"
	    }
	    
	    String line = bundle.getString(detalhe);
	    Pattern pattern = Pattern.compile("\\{[0-9]{1,4}\\}");
	    Matcher matcher = pattern.matcher(line);
	    String resultLine = "";
		
	    for (String param : values) {
	    	resultLine = matcher.replaceFirst(param);
	    	matcher = pattern.matcher(resultLine);
	    }
		
	    FacesMessage fm = new FacesMessage(severity, sumario, resultLine);
	    FacesContext fc = FacesContext.getCurrentInstance();
	    fc.addMessage(id, fm);
		
	}
	
	private static void validateMsg(Severity severity, String sumario, String detalhe) throws ValidatorException{

	    if (!sumario.equals("Sucesso!") 
		    && !sumario.equals("Alerta!")
		    && !sumario.equals("Erro!")) {
		sumario = bundle.getString(sumario);
	    } else {
		sumario = "";//para voltar a aparecer as mensagens "Sucesso!", "Alerta!" e "Erro!" basta apenas comentar o "else"
	    }
	    
            detalhe = bundle.getString(detalhe);
            FacesMessage fm = new FacesMessage(severity, sumario, detalhe);
            throw new ValidatorException(fm);
		
	}
	
	private static void validateMsgReplace(Severity severity, String sumario, String detalhe, String... values) throws ValidatorException {
            
	    if (!sumario.equals("Sucesso!") 
		    && !sumario.equals("Alerta!")
		    && !sumario.equals("Erro!")) {
		sumario = bundle.getString(sumario);
	    } else {
		sumario = "";//para voltar a aparecer as mensagens "Sucesso!", "Alerta!" e "Erro!" basta apenas comentar o "else"
	    }
	    
	    String line = bundle.getString(detalhe);
            Pattern pattern = Pattern.compile("\\{[0-9]{1,4}\\}");
            Matcher matcher = pattern.matcher(line);
            String resultLine = "";
            		
            for (String param : values) {
                resultLine = matcher.replaceFirst(param);
                matcher = pattern.matcher(resultLine);
            }
            
            FacesMessage fm = new FacesMessage(severity, sumario, resultLine);
            throw new ValidatorException(fm);

	}
	
	/**
	 * Metodo para exibir uma mensagem de erro na tela.
	 * 
	 * @param detalhe
	 */
	public static void errorMsg(String detalhe){
	    msg(FacesMessage.SEVERITY_ERROR, null, "Erro!", detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de erro na tela.
	 * 
	 * @param sumario
	 * @param detalhe
	 */
	public static void errorMsg(String sumario, String detalhe){
	    msg(FacesMessage.SEVERITY_ERROR, null, sumario, detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de erro na tela ao lado do componente.
	 * 
	 * @param id
	 * @param sumario
	 * @param detalhe
	 */
	public static void errorMsg(String id, String sumario, String detalhe){
	    msg(FacesMessage.SEVERITY_ERROR, id, sumario, detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de sucesso na tela.
	 * 
	 * @param detalhe
	 */
	public static void sucessoMsg(String detalhe){
	    msg(FacesMessage.SEVERITY_INFO, null, "Sucesso!", detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de sucesso na tela.
	 * 
	 * @param sumario
	 * @param detalhe
	 */
	public static void sucessoMsg(String sumario, String detalhe){
	    msg(FacesMessage.SEVERITY_INFO, null, sumario, detalhe);

	}
	
	/**
	 * Metodo para exibir uma mensagem de sucesso na tela ao lado do componente.
	 *
	 * @param id
	 * @param sumario
	 * @param detalhe
	 */
	public static void sucessoMsg(String id, String sumario, String detalhe){
	    msg(FacesMessage.SEVERITY_INFO, id, sumario, detalhe);

	}
	
	/**
	 * Metodo para exibir uma mensagem de alerta na tela.
	 * 
	 * @param detalhe
	 */
	public static void warningMsg(String detalhe){
	    msg(FacesMessage.SEVERITY_WARN, null, "Alerta!", detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de alerta na tela.
	 * 
	 * @param sumario
	 * @param detalhe
	 */
	public static void warningMsg(String sumario, String detalhe){
	    msg(FacesMessage.SEVERITY_WARN, null, sumario, detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de alerta na tela.
	 * 
	 * @param id
	 * @param sumario
	 * @param detalhe
	 */
	public static void warningMsg(String id, String sumario, String detalhe){
	    msg(FacesMessage.SEVERITY_WARN, id, sumario, detalhe);
	}

	
	/**
	 * Metodo para exibir uma mensagem de warning do resources passando parametros.
	 * 
	 * @param detalhe
	 * @param values
	 */
	public static void warningMsgReplace(String detalhe, String... values) {
	    msgReplace(FacesMessage.SEVERITY_WARN, null, "Alerta!", detalhe, values);
	}
	
	/**
	 * Metodo para exibir uma mensagem de warning do resources passando parametros.
	 * 
	 * @param sumario
	 * @param detalhe
	 * @param values
	 */
	public static void warningMsgReplace(String sumario, String detalhe, String... values) {
	    msgReplace(FacesMessage.SEVERITY_WARN, null, sumario, detalhe, values);
	}

	/**
	 * Metodo para exibir uma mensagem de warning do resources passando parametros.
	 * 
	 * @param id
	 * @param sumario
	 * @param detalhe
	 * @param values
	 */
	public static void warningMsgReplace(String id, String sumario, String detalhe, String... values) {
	    msgReplace(FacesMessage.SEVERITY_WARN, id, sumario, detalhe, values);
	}

	/**
	 * Metodo para exibir uma mensagem de erro do resources passando parametros.
	 * 
	 * @param detalhe
	 * @param values
	 */
	public static void errorMsgReplace(String detalhe, String... values) {
	    msgReplace(FacesMessage.SEVERITY_ERROR, null, "Erro!", detalhe, values);
	}
	
	/**
	 * Metodo para exibir uma mensagem de erro do resources passando parametros.
	 * 
	 * @param sumario
	 * @param detalhe
	 * @param values
	 */
	public static void errorMsgReplace(String sumario, String detalhe, String... values) {
	    msgReplace(FacesMessage.SEVERITY_ERROR, null, sumario, detalhe, values);
	}
	
	/**
	 * Metodo para exibir uma mensagem de erro do resources passando parametros.
	 * 
	 * @param id
	 * @param sumario
	 * @param detalhe
	 * @param values
	 */
	public static void errorMsgReplace(String id, String sumario, String detalhe, String... values) {
	    msgReplace(FacesMessage.SEVERITY_ERROR, id, sumario, detalhe, values);
	}

	/**
	 * Metodo para exibir uma mensagem de sucesso do resources passando parametros.
	 * 
	 * @param detalhe
	 * @param values
	 */
	public static void sucessoMsgReplace(String detalhe, String... values) {
	    msgReplace(FacesMessage.SEVERITY_INFO, null, "Sucesso!", detalhe, values);
	}
	
	/**
	 * Metodo para exibir uma mensagem de sucesso do resources passando parametros.
	 * 
	 * @param sumario
	 * @param detalhe
	 * @param values
	 */
	public static void sucessoMsgReplace(String sumario, String detalhe, String... values) {
	    msgReplace(FacesMessage.SEVERITY_INFO, null, sumario, detalhe, values);
	}
	
	/**
	 * Metodo para exibir uma mensagem de sucesso do resources passando parametros.
	 * 
	 * @param id
	 * @param sumario
	 * @param detalhe
	 * @param values
	 */
	public static void sucessoMsgReplace(String id, String sumario, String detalhe, String... values) {
	    msgReplace(FacesMessage.SEVERITY_INFO, id, sumario, detalhe, values);
	}
	
	/**
	 * Metodo para exibir uma mensagem de erro ao lado do componete. usando o atributo "validate"
	 * 
	 * @param detalhe
	 */
	public static void errorValidateMsg(String detalhe) throws ValidatorException{
	    validateMsg(FacesMessage.SEVERITY_ERROR, "Erro!", detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de erro ao lado do componete. usando o atributo "validate"
	 * 
	 * @param sumario
	 * @param detalhe
	 */
	public static void errorValidateMsg(String sumario, String detalhe) throws ValidatorException{
	    validateMsg(FacesMessage.SEVERITY_ERROR, sumario, detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de sucesso ao lado do componete. usando o atributo "validate"
	 * 
	 * @param detalhe
	 */
	public static void sucessoValidateMsg(String detalhe) throws ValidatorException{
	    validateMsg(FacesMessage.SEVERITY_INFO, "Sucesso!", detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de sucesso ao lado do componete. usando o atributo "validate"
	 * 
	 * @param sumario
	 * @param detalhe
	 */
	public static void sucessoValidateMsg(String sumario, String detalhe) throws ValidatorException{
	    validateMsg(FacesMessage.SEVERITY_INFO, sumario, detalhe);
	}
	
	
	/**
	 * Metodo para exibir uma mensagem de warning ao lado do componete. usando o atributo "validate"
	 * 
	 * @param detalhe
	 */
	public static void warningValidateMsg(String detalhe) throws ValidatorException{
	    validateMsg(FacesMessage.SEVERITY_WARN, "Alerta!", detalhe);
	}
	
	/**
	 * Metodo para exibir uma mensagem de warning ao lado do componete. usando o atributo "validate"
	 * 
	 * @param sumario
	 * @param detalhe
	 */
	public static void warningValidateMsg(String sumario, String detalhe) throws ValidatorException{
	    validateMsg(FacesMessage.SEVERITY_WARN, sumario, detalhe);
	}

	/**
	 *  Metodo para exibir uma mensagem de warning ao lado do componete passando parametros. usando o atributo "validate"
	 * 
	 * @param detalhe
	 * @param values
	 */
	public static void warningValidateMsgReplace(String detalhe, String... values) throws ValidatorException{
	    validateMsgReplace(FacesMessage.SEVERITY_WARN, "Alerta!", detalhe, values);
	}
	
	/**
	 *  Metodo para exibir uma mensagem de warning ao lado do componete passando parametros. usando o atributo "validate"
	 * 
	 * @param sumario
	 * @param detalhe
	 * @param values
	 */
	public static void warningValidateMsgReplace(String sumario, String detalhe, String... values) throws ValidatorException{
	    validateMsgReplace(FacesMessage.SEVERITY_WARN, sumario, detalhe, values);
	}
	
	
	/**
	 *  Metodo para exibir uma mensagem de error ao lado do componete passando parametros. usando o atributo "validate"
	 * 
	 * @param detalhe
	 * @param values
	 */
	public static void errorValidateMsgReplace(String detalhe, String... values) throws ValidatorException {
	    validateMsgReplace(FacesMessage.SEVERITY_ERROR, "Erro!", detalhe, values);
	}
	
	/**
	 *  Metodo para exibir uma mensagem de error ao lado do componete passando parametros. usando o atributo "validate"
	 * 
	 * @param sumario
	 * @param detalhe
	 * @param values
	 */
	public static void errorValidateMsgReplace(String sumario, String detalhe, String... values) throws ValidatorException {
	    validateMsgReplace(FacesMessage.SEVERITY_ERROR, sumario, detalhe, values);
	}
	
	/**
	 *  Metodo para exibir uma mensagem de sucesso ao lado do componete passando parametros. usando o atributo "validate"
	 * 
	 * @param detalhe
	 * @param values
	 */
	public static void sucessoValidateMsgReplace(String detalhe, String... values) throws ValidatorException {
	    validateMsgReplace(FacesMessage.SEVERITY_INFO, "Sucesso!", detalhe, values);
	}
	
	/**
	 *  Metodo para exibir uma mensagem de sucesso ao lado do componete passando parametros. usando o atributo "validate"
	 * 
	 * @param sumario
	 * @param detalhe
	 * @param values
	 */
	public static void sucessoValidateMsgReplace(String sumario, String detalhe, String... values) throws ValidatorException {
	    validateMsgReplace(FacesMessage.SEVERITY_INFO, sumario, detalhe, values);
	}
	
	/**
	 *  Metodo para limpar todas as mensagens.
	 */
	public static void cleanMessages() {
	    Iterator<String> itIds = FacesContext.getCurrentInstance().getClientIdsWithMessages();
	    while (itIds.hasNext())  {
		itIds.next();
		itIds.remove();
	    }
	}

}
