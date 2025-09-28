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

}