package bolao.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import bolao.excecoes.BolaoException;

public final class DataUtil {

    public static final String FORMATO_DD_MM = "dd/MM";
    public static final String FORMATO_HHMM = "HH'h'mm";

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

    public static String obterNomeDiaDaSemana(Date data) {
    	String semana[] = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
    	
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        calendar.setFirstDayOfWeek(Calendar.SUNDAY);
        
        return semana[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}