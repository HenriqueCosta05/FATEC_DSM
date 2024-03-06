package exercicio;

public class Porta {
   private PortaState estado;

    public PortaState getEstado() {
        return estado;
    }

    public void setEstado(PortaState estado) {
        this.estado = estado;
        estado.setStatus(estado.getClass().getSimpleName());
        System.out.println("Mudando o estado da porta para: " + estado.getStatus());
    }

    public void clicar() {
        this.estado.clicar();
    }

    public void abrirPorta() {
        this.estado.abrirPorta();
    }
    
    public void fecharPorta() {
        this.estado.fecharPorta();
    }

    public void manterPortaAberta() {
        this.estado.manterPortaAberta();
    }
}
