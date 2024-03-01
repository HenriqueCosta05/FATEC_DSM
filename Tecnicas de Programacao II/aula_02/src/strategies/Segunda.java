package strategies;

public class Segunda implements StrategyTemplate {
    @Override
    public void mensagemDoDia() {
        System.out.println("Novo começo, nova semana. Levante-se com determinação e comece a semana com entusiasmo. Suas conquistas esperam por você.");
    }
}
