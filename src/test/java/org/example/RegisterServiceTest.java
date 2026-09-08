package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterServiceTest {

    @Test
    void deveExecutarRegistro() {
        IService servico = ServiceFactory.obterServico("Register");
        assertEquals("Registro feito", servico.executar());
    }

    @Test
    void deveCancelarRegistro() {
        IService servico = ServiceFactory.obterServico("Register");
        assertEquals("Registro cancelado", servico.cancelar());
    }
}