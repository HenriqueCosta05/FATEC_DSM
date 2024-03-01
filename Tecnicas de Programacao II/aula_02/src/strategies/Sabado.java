package strategies;

public class Sabado implements StrategyTemplate {
    @Override
    public void mensagemDoDia() {
        System.out.println("Descanse, recarregue suas energias e faça o que te faz feliz. Este é o seu tempo para revitalizar sua mente e corpo para a próxima semana.");
    }
}
