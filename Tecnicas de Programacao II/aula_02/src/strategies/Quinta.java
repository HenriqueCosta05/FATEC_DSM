package strategies;

public class Quinta implements StrategyTemplate {
    @Override
    public void mensagemDoDia() {
        System.out.println("Você já percorreu tanto esta semana. Não desista agora! Grandes coisas estão por vir se você continuar seguindo em frente.");
    }
}
