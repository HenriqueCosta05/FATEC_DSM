package exercicio;

public class Fechada extends PortaState {
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
        Fechada fechadaState = new Fechada();
        Abrindo abrindoState = new Abrindo();
        Aberta abertaState = new Aberta();
        setEstado(fechadaState);
        setEstado(abrindoState);
        setEstado(abertaState);
        result = "Porta aberta!";
        System.out.println(result);
    }

    @Override
    public void fecharPorta() {
        result = "Falha na execução do método: porta já está fechada!";
        System.out.println(result);
    }

    @Override
    public void manterPortaAberta() {
        Fechada fechadaState = new Fechada();
        Abrindo abrindoState = new Abrindo();
        Aberta abertaState = new Aberta();
        ManterAberta manterAbertaState = new ManterAberta();
        setEstado(fechadaState);
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
        this.setStatus("Fechada");
        result = "Porta fechada!";
    }

    public String getResult() {
        return result;
    }
}
