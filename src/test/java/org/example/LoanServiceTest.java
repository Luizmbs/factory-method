package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanServiceTest {

    @Test
    void deveExecutarEmprestimo() {
        IService servico = ServiceFactory.obterServico("Loan");
        assertEquals("Empréstimo concluído", servico.executar());
    }

    @Test
    void deveCancelarEmprestimo() {
        IService servico = ServiceFactory.obterServico("Loan");
        assertEquals("Empréstimo cancelado", servico.cancelar());
    }
}