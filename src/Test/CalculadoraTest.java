package Test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testRestar() {
        int resultado = calc.restar(4, 3);
        assertEquals("ese resultado deberia dar 1", 1, resultado);
    }

    @Test
    public void testEsPar() {
        assertTrue("2 debería ser par", calc.esPar(2));
        assertFalse("7 no debería ser par", calc.esPar(7));
        assertTrue("6 debería ser par", calc.esPar(6));
        assertTrue("12 debería ser par", calc.esPar(12));
    }

    @Test
    public void testFactorial() {
        assertEquals("0! debe dar: 1", 1, calc.factorial(0));
        assertEquals("3! debe dar: 6", 6, calc.factorial(3));
        assertEquals("5! debe dar: 120", 120, calc.factorial(5));
    }
}
