package exercicio;

public class Fechando extends PortaState {
    PortaState state;
    private String result = "";

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
        Fechando fechandoState = new Fechando();
        Abrindo abrindoState = new Abrindo();
        Aberta abertaState = new Aberta();
        setEstado(fechandoState);
        setEstado(abrindoState);
        setEstado(abertaState);
        result = "Porta aberta!";
    }

    @Override
    public void fecharPorta() {
        result = "Falha na execução do método: porta já está fechando!";
        System.out.println(result);
    }

    @Override
    public void manterPortaAberta() {
        Fechando fechandoState = new Fechando();
        Abrindo abrindoState = new Abrindo();
        Aberta abertaState = new Aberta();
        ManterAberta manterAbertaState = new ManterAberta();
        setEstado(fechandoState);
        setEstado(abrindoState);
        setEstado(abertaState);
        setEstado(manterAbertaState);
        result = "Porta aberta e mantida no estado atual!";
        System.out.println(result);
    }

    @Override
    public void clicar() {
        Porta porta = new Porta();
        porta.setEstado(this);
        result = "Fechando a porta...";
    }

    public String getResult() {
        return result;
    }
}
