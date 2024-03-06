package exercicio;

public class Abrindo extends PortaState {
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
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public void abrirPorta() {
        result = "Falha na execução do método: a porta já está abrindo!";
        System.out.println(result);
    }

    @Override
    public void fecharPorta() {
        Fechando fechandoState = new Fechando();
        Fechada fechadaState = new Fechada();
        result = "Fechando a porta...";
        setEstado(fechandoState);
        setEstado(fechadaState);
        result = "Porta fechada!";
        System.out.println(result);
    }

    @Override
    public void manterPortaAberta() {
        Aberta abertaState = new Aberta();
        ManterAberta manterAbertaState = new ManterAberta();
        setEstado(abertaState);
        setEstado(manterAbertaState);
        result = "Porta mantida aberta!";
        System.out.println(result);
    }

    @Override
    public void clicar() {
        Porta porta = new Porta();
        porta.setEstado(this);
        this.setStatus("Abrindo");
        result = "Abrindo a porta...";
    }

    public String getResult() {
        return result;
    }
}
