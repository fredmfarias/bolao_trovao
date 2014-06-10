package bolao.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import bolao.excecoes.BolaoException;

public final class DataUtil {

    public static final String FORMATO_DD_MM = "dd/MM";
    public static final String FORMATO_HHMM = "HH'h'mm";
    public static final String FORMATO_DD_MM_YYYY = "dd/MM/yyyy";

    private static DataUtil INSTANCE = new DataUtil();
    
    private DataUtil() {
    	
    }
    
    public static DataUtil getInstance(){
    	return INSTANCE;
    }
    
    public static String formatar(Date data, String padrao)
            throws BolaoException {

        String dataFormatada = null;

        try {

            SimpleDateFormat formatador = new SimpleDateFormat(padrao);
            formatador.setLenient(true);
            dataFormatada = formatador.format(data);

        } catch (Exception e) {
            throw new BolaoException("Erro ao formatar data", e);
        }

        return dataFormatada;
    }

    public static String formatarDDMM(Date data) throws BolaoException {
        return DataUtil.formatar(data, DataUtil.FORMATO_DD_MM);
    }
    
    public static String formatarHHmm(Date data) throws BolaoException {
        return DataUtil.formatar(data, DataUtil.FORMATO_HHMM);
    }
    
    public static String formatarDDMMYYYY(Date data) throws BolaoException {
        return DataUtil.formatar(data, DataUtil.FORMATO_DD_MM_YYYY);
    }

    public static String obterNomeDiaDaSemana(Date data) {
    	String semana[] = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
    	
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        calendar.setFirstDayOfWeek(Calendar.SUNDAY);
        
        return semana[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
    
    public static Date obterData(int dia, int mes, int ano
    		, int hora, int minutos) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes - 1);
        calendar.set(Calendar.YEAR, ano);
        calendar.set(Calendar.HOUR_OF_DAY, hora);
        calendar.set(Calendar.MINUTE, minutos);
        calendar.set(Calendar.SECOND, 0);

        return calendar.getTime();
    }
    
    public static Date obterData(int dia, int mes, int ano) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes - 1);
        calendar.set(Calendar.YEAR, ano);
       
        return calendar.getTime();
    }
    
    public static boolean isDataAnterior(Date data) {
    	
    	Date dataAtual = new Date();
        
        return data.before(dataAtual);
    }
}