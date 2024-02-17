package ex_01_carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void testAcelerar() {
        Carro c1 = new Carro();
        c1.acelerar(7);
        c1.acelerar(7);
        c1.acelerar(7);
        c1.acelerar(7);
        assertEquals(c1.getVelocidade(), 28);
    }

    @Test
    public void testFrear(){
        Carro c1 = new Carro();
        c1.frear();
        assertEquals(c1.getVelocidade(), 0);
    }

    @Test
    public void testEhIgual(){
        Carro c1 = new Carro("Fiat", "Preto", "Uno", 2013);
        Carro c2 = new Carro("Fiat", "Preto", "Uno", 2013);
        assertEquals(c1.getVelocidade(), 0);
    }
}