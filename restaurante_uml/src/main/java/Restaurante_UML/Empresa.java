package Restaurante_UML;

public class Empresa extends Cliente {

    private String razonSocial;

    @Override
    public String obtenerTipoCliente() {
        return "Empresa";
    }
}
