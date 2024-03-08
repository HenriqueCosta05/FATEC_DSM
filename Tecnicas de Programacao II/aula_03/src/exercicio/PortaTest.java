package exercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PortaTest {

    @Test
    void clicarTest_v1() {
        Porta porta = new Porta();
        porta.setState(porta.ABERTA);
        assertEquals(porta.status(), "Aberta");
    }

    @Test
    void clicarTest_v2() {
        Porta porta = new Porta();
        porta.setState(porta.FECHADO);
        assertEquals(porta.status(), "Fechada");
    }

    @Test
    void clicarTest_v3() {
        Porta porta = new Porta();
        porta.setState(porta.ABRINDO);
        assertEquals(porta.status(), "Abrindo");
    }

    @Test
    void clicarTest_v4() {
        Porta porta = new Porta();
        porta.setState(porta.FECHANDO);
        assertEquals(porta.status(), "Fechando");
    }

    @Test
    void clicarTest_v5() {
        Porta porta = new Porta();
        porta.setState(porta.MANTER_ABERTA);
        assertEquals(porta.status(), "Manter aberta");
    }
}