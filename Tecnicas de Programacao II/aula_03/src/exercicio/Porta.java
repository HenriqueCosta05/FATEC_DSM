package exercicio;

public class Porta {
    public final PortaState ABERTA = new Aberta();
    public final PortaState ABRINDO = new Abrindo();
    public final PortaState FECHADO = new Fechada();
    public final PortaState FECHANDO = new Fechando();
    public final PortaState MANTER_ABERTA = new ManterAberta();

    private PortaState state;

    public void setState(PortaState state){
        this.state = state;
    }
    public String status(){
        return state.clicar();
    }
}
