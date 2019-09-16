package Restaurante_UML.repositorio.menu;

import Restaurante_UML.ingredientes.Ingrediente;
import Restaurante_UML.ingredientes.IngredienteLiquido;
import Restaurante_UML.ingredientes.IngredienteSolido;
import Restaurante_UML.Receta;
import Restaurante_UML.constantes.ConstanteNombreIngrediente;
import Restaurante_UML.constantes.ConstanteTipoIngrediente;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMenuImplementacion implements IRepositorioMenu {
    @Override
    public List<Receta> cargarRecetas() {
        List<Receta> recetas = obtenerRecetas();
        return recetas;
    }

    private List<Receta> obtenerRecetas(){

        List<Receta> recetas = new ArrayList<>();

        Receta bandejaDeRes = new Receta("Bandeja de res",10000);

        Ingrediente arroz = new IngredienteSolido(ConstanteNombreIngrediente.ARROZ,0.1, ConstanteTipoIngrediente.NORMAL);
        bandejaDeRes.agregarIngrediente(arroz);

        Ingrediente frijol = new IngredienteSolido(ConstanteNombreIngrediente.FRIJOLES,0.1,ConstanteTipoIngrediente.NORMAL);
        bandejaDeRes.agregarIngrediente(frijol);

        Ingrediente papaCapira = new IngredienteSolido(ConstanteNombreIngrediente.PAPA_CAPIRA,0.5,ConstanteTipoIngrediente.NORMAL);
        bandejaDeRes.agregarIngrediente(papaCapira);

        Ingrediente carneRes = new IngredienteSolido(ConstanteNombreIngrediente.CARNE_RES,0.1,ConstanteTipoIngrediente.RES);
        bandejaDeRes.agregarIngrediente(carneRes);

        Ingrediente aceite = new IngredienteLiquido(ConstanteNombreIngrediente.ACEITE,0.01,ConstanteTipoIngrediente.NORMAL);
        bandejaDeRes.agregarIngrediente(aceite);

        recetas.add(bandejaDeRes);

        Receta pescadoConPapasFritasYensalada = new Receta("Pescado con papas fritas y ensalada",15000);

        Ingrediente pescado = new IngredienteSolido(ConstanteNombreIngrediente.PESCADO,1,ConstanteTipoIngrediente.NORMAL);
        pescadoConPapasFritasYensalada.agregarIngrediente(pescado);

        Ingrediente tomate = new IngredienteSolido(ConstanteNombreIngrediente.TOMATE,1,ConstanteTipoIngrediente.NORMAL);
        pescadoConPapasFritasYensalada.agregarIngrediente(tomate);

        Ingrediente lechuga = new IngredienteSolido(ConstanteNombreIngrediente.LECHUGA,0.25,ConstanteTipoIngrediente.NORMAL);
        pescadoConPapasFritasYensalada.agregarIngrediente(lechuga);

        papaCapira = new IngredienteSolido(ConstanteNombreIngrediente.PAPA_CAPIRA,1,ConstanteTipoIngrediente.NORMAL);
        pescadoConPapasFritasYensalada.agregarIngrediente(papaCapira);

        aceite = new IngredienteLiquido(ConstanteNombreIngrediente.ACEITE,0.1,ConstanteTipoIngrediente.NORMAL);
        pescadoConPapasFritasYensalada.agregarIngrediente(aceite);

        recetas.add(pescadoConPapasFritasYensalada);

        return recetas;
    }
}
