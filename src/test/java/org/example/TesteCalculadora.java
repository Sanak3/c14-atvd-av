package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCalculadora {

    Calculadora calc = new Calculadora();

    // --- Testes de operações básicas ---
    //1
    @Test
    void testSomaPositivos() {
        assertEquals(2, calc.Soma(1, 1));
    }

    //2
    @Test
    void testSomaComZero() {
        assertEquals(5, calc.Soma(5, 0));
    }

    //3
    @Test
    void testSomaNegativos() {
        assertEquals(-10, calc.Soma(-6, -4));
    }

    //4
    @Test
    void testSubtrairResultadoNegativo() {
        assertEquals(-3, calc.Subtrair(2, 5));
    }

    //5
    @Test
    void testSubtrairZero() {
        assertEquals(7, calc.Subtrair(7, 0));
    }

    //6
    @Test
    void testMultiplicacaoPorZero() {
        assertEquals(0, calc.Multiplicacao(10, 0));
    }

    //7
    @Test
    void testMultiplicacaoNegativoPorPositivo() {
        assertEquals(-15, calc.Multiplicacao(-3, 5));
    }

    //8
    @Test
    void testDivisaoSimples() {
        assertEquals(5, calc.Divisao(10, 2));
    }

    //9
    @Test
    void testDivisaoComResultadoDecimal() {
        assertEquals(2.5, calc.Divisao(5, 2));
    }

    //10
    @Test
    void testDivisaoPorZeroLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> calc.Divisao(5, 0));
    }


    // --- Testes de cálculos "complexos" ---

    //11
    @Test
    void testRaizQuadradaPositiva() {
        assertEquals(4, calc.raizQuadrada(16));
    }

    //12
    @Test
    void testRaizQuadradaDeZero() {
        assertEquals(0, calc.raizQuadrada(0));
    }

    //13
    @Test
    void testRaizQuadradaNegativaLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> calc.raizQuadrada(-9));
    }

    //14
    @Test
    void testExponencial() {
        assertEquals(8, calc.exponencial(2, 3));
    }

    //15
    @Test
    void testExponencialBaseNegativaExpoenteImpar() {
        assertEquals(-27, calc.exponencial(-3, 3));
    }

    //16
    @Test
    void testExponencialComExpoenteZero() {
        assertEquals(1, calc.exponencial(10, 0));
    }

    //17
    @Test
    void testPorcentagemSimples() {
        assertEquals(50, calc.porcentagem(200, 25));
    }

    // --- Testes de trigonometria ---
    //18
    @Test
    void testSenoDe90Graus() {
        assertEquals(1, calc.seno(90), 0.0001);
    }

    //19
    @Test
    void testCosenoDe180Graus() {
        assertEquals(-1, calc.coseno(180), 0.0001);
    }

    //20
    @Test
    void testTangenteDe45Graus() {
        assertEquals(1, calc.tangente(45), 0.0001);
    }
}