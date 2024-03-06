package exercicio;

public abstract class PortaState {
    private String status;

    public abstract PortaState getEstado();

    public abstract void setEstado(PortaState state);

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void abrirPorta();

    public abstract void fecharPorta();

    public abstract void manterPortaAberta();

    public abstract void clicar();

}
