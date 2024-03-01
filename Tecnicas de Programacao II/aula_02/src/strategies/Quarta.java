package strategies;

public class Quarta implements StrategyTemplate {
    @Override
    public void mensagemDoDia() {
        System.out.println("É hora de recarregar as energias. A semana está na metade, mas suas capacidades são infinitas. Continue perseverando!");
    }
}
