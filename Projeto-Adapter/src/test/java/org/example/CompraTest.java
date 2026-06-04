package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveRetornarValorDolarCompra() {
        Compra compra = new Compra();
        compra.setValorEmDolar(1000.0f);

        assertEquals("R$1000,00", compra.getValorEmDolar());
    }

    @Test
    void deveRetornarValorRealCompra() {
        Compra compra = new Compra();
        compra.setValorEmDolar(1000.0f);

        assertEquals(200.0f, compra.getValorEmReal());
    }
}