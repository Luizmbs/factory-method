package org.example;

public class RegisterService implements IService{

    public String executar() {
        return "Registro feito";
    }

    public String cancelar() {
        return "Registro cancelado";
    }
}
