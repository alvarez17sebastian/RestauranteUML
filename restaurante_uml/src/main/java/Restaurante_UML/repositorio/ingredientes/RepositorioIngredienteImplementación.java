package Restaurante_UML.repositorio.ingredientes;

import Restaurante_UML.ingredientes.Ingrediente;
import Restaurante_UML.ingredientes.IngredienteLiquido;
import Restaurante_UML.ingredientes.IngredienteSolido;
import Restaurante_UML.constantes.ConstanteNombreIngrediente;
import Restaurante_UML.constantes.ConstanteTipoIngrediente;

import java.util.ArrayList;
import java.util.List;

public class RepositorioIngredienteImplementación implements IRepositorioIngrediente {
    @Override
    public List<Ingrediente> cargarIngredientes() {
        return obtenerIngredientes();
    }

    private List<Ingrediente> obtenerIngredientes(){

        List<Ingrediente> ingredientes = new ArrayList<>();

        Ingrediente arroz = new IngredienteSolido(ConstanteNombreIngrediente.ARROZ,20, ConstanteTipoIngrediente.NORMAL);
        Ingrediente frijol = new IngredienteSolido(ConstanteNombreIngrediente.FRIJOLES,20, ConstanteTipoIngrediente.NORMAL);
        Ingrediente papaCapira = new IngredienteSolido(ConstanteNombreIngrediente.PAPA_CAPIRA,20, ConstanteTipoIngrediente.NORMAL);
        Ingrediente carneRes = new IngredienteSolido(ConstanteNombreIngrediente.CARNE_RES,20, ConstanteTipoIngrediente.RES);
        Ingrediente aceite = new IngredienteLiquido(ConstanteNombreIngrediente.ACEITE,20, ConstanteTipoIngrediente.NORMAL);
        Ingrediente pescado = new IngredienteSolido(ConstanteNombreIngrediente.PESCADO,20, ConstanteTipoIngrediente.NORMAL);
        Ingrediente tomate = new IngredienteSolido(ConstanteNombreIngrediente.TOMATE,20, ConstanteTipoIngrediente.NORMAL);
        Ingrediente lechuga = new IngredienteSolido(ConstanteNombreIngrediente.LECHUGA,20, ConstanteTipoIngrediente.NORMAL);

        ingredientes.add(arroz);
        ingredientes.add(frijol);
        ingredientes.add(papaCapira);
        ingredientes.add(carneRes);
        ingredientes.add(aceite);
        ingredientes.add(pescado);
        ingredientes.add(tomate);
        ingredientes.add(lechuga);

        return ingredientes;

    }
}
