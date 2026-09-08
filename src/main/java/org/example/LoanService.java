package org.example;

public class LoanService implements IService{
    public String executar() {
        return "Empréstimo concluído";
    }

    public String cancelar() {
        return "Empréstimo cancelado";
    }
}
