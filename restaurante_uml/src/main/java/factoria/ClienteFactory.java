package factoria;
import Restaurante_UML.Cliente;
import Restaurante_UML.Empresa;
import Restaurante_UML.Interfaces.IReserva;
import Restaurante_UML.Persona;
import Restaurante_UML.constantes.ConstanteTipoCliente;

public class ClienteFactory {


    public static Cliente obtenerCliente(int tipoCliente,String identificación, String nombre){

        switch (tipoCliente){
            case ConstanteTipoCliente.KEY_CLIENTE_PERSONA:
                return new Persona(identificación,nombre);

            case ConstanteTipoCliente.KEY_CLIENTE_EMPRESA:
                return new Empresa(identificación,nombre);

            default:
                return null;
        }
    }
}
