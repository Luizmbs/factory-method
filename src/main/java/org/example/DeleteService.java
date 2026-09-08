package org.example;

public class DeleteService implements IService{

    public String executar() {
        return "Deleção completa";
    }

    public String cancelar() {
        return "Deleção cancelada";
    }
}
