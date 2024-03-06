package exercicio;

public class Aberta extends PortaState {
    private String result = "";
    PortaState state;
    @Override
    public PortaState getEstado() {
        return this;
    }

    @Override
    public void setEstado(PortaState state) {
        this.state = state;
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public void abrirPorta() {
        result = "Falha na execução do método: a porta já está aberta!";
    }

    @Override
    public void fecharPorta() {
        Fechando fechandoState = new Fechando();
        Fechada fechadaState = new Fechada();
        result = "Fechando a porta...";
        setEstado(fechandoState);
        setEstado(fechadaState);
        System.out.println(result);
    }

    @Override
    public void manterPortaAberta() {
        ManterAberta manterAbertaState = new ManterAberta();
        setEstado(manterAbertaState);
        result = "Porta mantida aberta!";
        System.out.println(result);
    }

    @Override
    public void clicar() {
        Porta porta = new Porta();
        PortaState portaState;
        porta.setEstado(this);
        this.setStatus("Aberta");
        result = "Porta aberta!";
    }

    public String getResult() {
        return result;
    }
}
