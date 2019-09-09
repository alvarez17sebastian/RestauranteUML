package Restaurante_UML;

public class Empresa extends Cliente {

    private String razonSocial;

    public Empresa(){

    }

    public Empresa(String nit,String nombre){
        super(nit,nombre);
    }

    @Override
    public String obtenerTipoCliente() {
        return "Empresa";
    }
}
