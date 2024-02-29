import strategies.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Mensagem {

    Dia msg;
    private GregorianCalendar calendar = new GregorianCalendar();
    int diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK);

    public void mostrarMensagem() {
        switch (diaDaSemana) {
            case GregorianCalendar.SUNDAY:
                msg = new Domingo();
                msg.mensagemDoDia();
            case GregorianCalendar.MONDAY:
                msg = new Segunda();
                msg.mensagemDoDia();
            case GregorianCalendar.TUESDAY:
                msg = new Terca();
                msg.mensagemDoDia();
            case GregorianCalendar.WEDNESDAY:
                msg = new Quarta();
                msg.mensagemDoDia();
            case GregorianCalendar.THURSDAY:
                msg = new Quinta();
                msg.mensagemDoDia();
            case GregorianCalendar.FRIDAY:
                msg = new Sexta();
                msg.mensagemDoDia();
            case GregorianCalendar.SATURDAY:
                msg = new Sabado();
                msg.mensagemDoDia();

        }
    }


}
