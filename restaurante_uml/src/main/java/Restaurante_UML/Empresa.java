package Restaurante_UML;

import Restaurante_UML.constantes.ConstanteTipoCliente;

public class Empresa extends Cliente{

    public Empresa(String NIT,String nombreEmpresa){
        super(NIT,nombreEmpresa);
    }

    @Override
    public String obtenerTipoCliente() {
        return ConstanteTipoCliente.CLIENTE_EMPRESA;
    }
}
