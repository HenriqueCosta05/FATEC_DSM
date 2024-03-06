package exercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PortaTest {

    @Test
    void setEstado_v1_aberta() {
        Porta porta = new Porta();
        Aberta abertaState = new Aberta();
        porta.setEstado(abertaState);
        PortaState result = porta.getEstado();
        assertEquals(result, abertaState);
    }

    @Test
    void setEstado_v2_abrindo() {
        Porta porta = new Porta();
        Abrindo abrindoState = new Abrindo();
        porta.setEstado(abrindoState);
        assertEquals(porta.getEstado(), abrindoState);
    }

    @Test
    void setEstado_v3_fechada() {
        Porta porta = new Porta();
        Fechada fechadaState = new Fechada();
        porta.setEstado(fechadaState);
        assertEquals(porta.getEstado(), fechadaState);
    }

    @Test
    void setEstado_v4_fechando() {
        Porta porta = new Porta();
        Fechando fechandoState = new Fechando();
        porta.setEstado(fechandoState);
        assertEquals(porta.getEstado(), fechandoState);
    }

    @Test
    void setEstado_v5_manterAberta() {
        Porta porta = new Porta();
        ManterAberta manterAbertaState = new ManterAberta();
        porta.setEstado(manterAbertaState);
        assertEquals(porta.getEstado(), manterAbertaState);
    }

    @Test
    void clicar_v1_aberta_manter_aberta() {
        Porta porta = new Porta();
        Aberta abertaState = new Aberta();
        ManterAberta manterAbertaState = new ManterAberta();
        porta.setEstado(abertaState);
        porta.clicar();
        porta.setEstado(manterAbertaState);
        porta.clicar();
        assertEquals(porta.getEstado(), manterAbertaState);
    }

    @Test
    void clicar_v2_aberta_fechando() {
        Porta porta = new Porta();
        Aberta abertaState = new Aberta();
        Fechando fechandoState = new Fechando();
        porta.setEstado(abertaState);
        porta.clicar();
        porta.setEstado(fechandoState);
        porta.clicar();
        assertEquals(porta.getEstado(), fechandoState);
    }

    @Test
    void clicar_v3_fechando_fechada() {
        Porta porta = new Porta();
        Fechando fechandoState = new Fechando();
        Fechada fechadaState = new Fechada();
        porta.setEstado(fechandoState);
        porta.clicar();
        porta.setEstado(fechadaState);
        porta.clicar();
        assertEquals(porta.getEstado(), fechadaState);
    }

    @Test
    void clicar_v4_fechada_abrindo() {
        Porta porta = new Porta();
        Fechada fechadaState = new Fechada();
        Abrindo abrindoState = new Abrindo();
        porta.setEstado(fechadaState);
        porta.clicar();
        porta.setEstado(abrindoState);
        porta.clicar();
        assertEquals(porta.getEstado(), abrindoState);
    }

    @Test
    void clicar_v5_abrindo_aberta() {
        Porta porta = new Porta();
        Abrindo abrindoState = new Abrindo();
        Aberta abertaState = new Aberta();
        porta.setEstado(abrindoState);
        porta.clicar();
        porta.setEstado(abertaState);
        porta.clicar();
        assertEquals(porta.getEstado(), abertaState);
    }

    @Test
    void abrirPorta_v1_aberta() {
        Porta porta = new Porta();
        Aberta abertaState = new Aberta();
        porta.setEstado(abertaState);
        porta.abrirPorta();
        assertEquals(abertaState.getResult(), "Falha na execução do método: a porta já está aberta!");
    }

    @Test
    void abrirPorta_v2_fechada() {
        Porta porta = new Porta();
        Fechada fechadaState = new Fechada();
        porta.setEstado(fechadaState);
        porta.abrirPorta();
        assertEquals(fechadaState.getResult(), "Porta aberta!");
    }

    @Test
    void abrirPorta_v3_abrindo() {
        Porta porta = new Porta();
        Abrindo abrindoState = new Abrindo();
        porta.setEstado(abrindoState);
        porta.abrirPorta();
        assertEquals(abrindoState.getResult(), "Falha na execução do método: a porta já está abrindo!");
    }

    @Test
    void abrirPorta_v4_fechando() {
        Porta porta = new Porta();
        Fechando fechandoState = new Fechando();
        porta.setEstado(fechandoState);
        porta.abrirPorta();
        assertEquals(fechandoState.getResult(), "Porta aberta!");
    }

    @Test
    void abrirPorta_v5_manterAberta() {
        Porta porta = new Porta();
        ManterAberta manterAbertaState = new ManterAberta();
        porta.setEstado(manterAbertaState);
        porta.abrirPorta();
        assertEquals(manterAbertaState.getResult(), "Falha na execução do método: a porta já está aberta!");
    }

    @Test
    void fecharPorta_v1_aberta() {
        Porta porta = new Porta();
        Aberta abertaState = new Aberta();
        porta.setEstado(abertaState);
        porta.fecharPorta();
        assertEquals(abertaState.getResult(), "Fechando a porta...");
    }

    @Test
    void fecharPorta_v2_abrindo() {
        Porta porta = new Porta();
        Abrindo abrindoState = new Abrindo();
        porta.setEstado(abrindoState);
        porta.fecharPorta();
        assertEquals(abrindoState.getResult(), "Porta fechada!");
    }

    @Test
    void fecharPorta_v3_Fechada() {
        Porta porta = new Porta();
        Fechada fechadaState = new Fechada();
        porta.setEstado(fechadaState);
        porta.fecharPorta();
        assertEquals(fechadaState.getResult(), "Falha na execução do método: porta já está fechada!");
    }

    @Test
    void fecharPorta_v4_Fechando() {
        Porta porta = new Porta();
        Fechando fechandoState = new Fechando();
        porta.setEstado(fechandoState);
        porta.fecharPorta();
        assertEquals(fechandoState.getResult(), "Falha na execução do método: porta já está fechando!");
    }

    @Test
    void fecharPorta_v5_ManterAberta() {
        Porta porta = new Porta();
        ManterAberta manterAbertaState = new ManterAberta();
        porta.setEstado(manterAbertaState);
        porta.fecharPorta();
        assertEquals(manterAbertaState.getResult(), "Fechando a porta...");
    }

    @Test
    void manterPortaAberta_v1_aberta() {
        Porta porta = new Porta();
        Aberta abertaState = new Aberta();
        porta.setEstado(abertaState);
        porta.manterPortaAberta();
        assertEquals(abertaState.getResult(), "Porta mantida aberta!");
    }

    @Test
    void manterPortaAberta_v2_abrindo() {
        Porta porta = new Porta();
        Abrindo abrindoState = new Abrindo();
        porta.setEstado(abrindoState);
        porta.manterPortaAberta();
        assertEquals(abrindoState.getResult(), "Porta mantida aberta!");
    }

    @Test
    void manterPortaAberta_v3_Fechada() {
        Porta porta = new Porta();
        Fechada fechadaState = new Fechada();
        porta.setEstado(fechadaState);
        porta.manterPortaAberta();
        assertEquals(fechadaState.getResult(), "Porta aberta e mantida no estado atual!");
    }

    @Test
    void manterPortaAberta_v4_Fechando() {
        Porta porta = new Porta();
        Fechando fechandoState = new Fechando();
        porta.setEstado(fechandoState);
        porta.manterPortaAberta();
        assertEquals(fechandoState.getResult(), "Porta aberta e mantida no estado atual!");
    }

    @Test
    void manterPortaAberta_v5_ManterAberta() {
        Porta porta = new Porta();
        ManterAberta manterAbertaState = new ManterAberta();
        porta.setEstado(manterAbertaState);
        porta.manterPortaAberta();
        assertEquals(manterAbertaState.getResult(), "Falha na execução do método: a porta já está aberta!");
    }


}