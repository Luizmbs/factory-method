package org.example;

public class ReturnService implements IService{
    @Override
    public String executar() {
        return "Devolução concluida";
    }

    @Override
    public String cancelar() {
        return "Devolução cancelada";
    }
}
