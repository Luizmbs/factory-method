package org.example;

public class SeviceFactory {
    public static IService obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.exemple." + servico + "Service");
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IService)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IService) objeto;
    }
}
