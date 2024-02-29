package ex_02_pizza;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class PizzaTest {

    @Test
    public void testGetPreco() {
        Pizza p1 = new Pizza();
        p1.adicionaIngredientes("mussarela");
        p1.adicionaIngredientes("oregano");
        assertEquals(30,p1.getPreco(),0);
    }

    @Test
    public void testGetPreco3Ingredientes() {
        Pizza p1 = new Pizza();
        p1.adicionaIngredientes("mussarela");
        p1.adicionaIngredientes("oregano");
        p1.adicionaIngredientes("mangericao");

        assertEquals(45,p1.getPreco(),0);
    }

    @Test
    public void testGetPreco6Ingredientes() {
        Pizza p1 = new Pizza();
        p1.adicionaIngredientes("mussarela");
        p1.adicionaIngredientes("oregano");
        p1.adicionaIngredientes("mangericao");
        p1.adicionaIngredientes("ovo");
        p1.adicionaIngredientes("presunto");
        p1.adicionaIngredientes("pimentao");
        assertEquals(60,p1.getPreco(),0);
    }
}
