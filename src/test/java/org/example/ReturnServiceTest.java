package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnServiceTest {

    @Test
    void deveExecutarDevolucao() {
        IService servico = ServiceFactory.obterServico("Return");
        assertEquals("Devolução concluida", servico.executar());
    }

    @Test
    void deveCancelarDevolucao() {
        IService servico = ServiceFactory.obterServico("Return");
        assertEquals("Devolução cancelada", servico.cancelar());
    }
}