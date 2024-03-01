import strategies.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Context {

    StrategyTemplate msg;
    private GregorianCalendar calendar = new GregorianCalendar();
    int diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK);

    public void mostrarMensagem() {
        switch (diaDaSemana) {
            case GregorianCalendar.SUNDAY:
                msg = new Domingo();
                msg.mensagemDoDia();
                break;
            case GregorianCalendar.MONDAY:
                msg = new Segunda();
                msg.mensagemDoDia();
                break;
            case GregorianCalendar.TUESDAY:
                msg = new Terca();
                msg.mensagemDoDia();
                break;
            case GregorianCalendar.WEDNESDAY:
                msg = new Quarta();
                msg.mensagemDoDia();
                break;
            case GregorianCalendar.THURSDAY:
                msg = new Quinta();
                msg.mensagemDoDia();
                break;
            case GregorianCalendar.FRIDAY:
                msg = new Sexta();
                msg.mensagemDoDia();
                break;
            case GregorianCalendar.SATURDAY:
                msg = new Sabado();
                msg.mensagemDoDia();
                break;
        }
    }


}
