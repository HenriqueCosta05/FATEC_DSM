package exercicio;

public class ManterAberta extends PortaState {
    private String result = "";
    PortaState state;

    @Override
    public void setEstado(PortaState state) {
        this.state = state;
    }

    @Override
    public PortaState getEstado() {
        return this;
    }

    @Override
    public void abrirPorta() {
        result = "Falha na execução do método: a porta já está aberta!";
        System.out.println(result);
    }

    @Override
    public void fecharPorta() {
        ManterAberta manterAbertaState = new ManterAberta();
        Fechando fechandoState = new Fechando();
        Fechada fechadaState = new Fechada();
        result = "Fechando a porta...";
        System.out.println(result);
        setEstado(fechandoState);
        setEstado(fechadaState);
    }

    @Override
    public void manterPortaAberta() {
        result = "Falha na execução do método: a porta já está aberta!";
    }

    @Override
    public void clicar() {
        Porta porta = new Porta();
        porta.setEstado(this);
        this.setStatus("Manter aberta");
        result = "Porta foi mantida aberta!";
    }
    public String getResult() {
        return result;
    }
}
