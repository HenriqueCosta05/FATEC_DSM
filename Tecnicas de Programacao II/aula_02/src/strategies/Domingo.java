package strategies;


public class Domingo implements StrategyTemplate {
    @Override
    public void mensagemDoDia() {
        System.out.println("Prepare-se para uma nova jornada. Que o domingo seja um dia de reflexão, planejamento e preparação para uma semana cheia de oportunidades e sucesso.");
    }
}
