package Restaurante_UML;

import Restaurante_UML.ingredientes.Ingrediente;
import Restaurante_UML.platos.Plato;
import Restaurante_UML.factoria.PlatoFactory;
import Restaurante_UML.repositorio.ingredientes.IRepositorioIngrediente;
import Restaurante_UML.repositorio.ingredientes.RepositorioIngredienteImplementación;

import java.util.ArrayList;
import java.util.List;

public class Cocina  {

    private String especialidad;
    private String direccion;
    private String telefono;
    private String jefeCocina;
    private List<Ingrediente> inventarioIngredientes = new ArrayList<>();

    protected Restaurante restaurante;
    protected IRepositorioIngrediente repositorioIngrediente;

    private Plato plato;

    public static Cocina instanciaCocina = null;

    private Cocina(){
        repositorioIngrediente = new RepositorioIngredienteImplementación();
        inventarioIngredientes = repositorioIngrediente.cargarIngredientes();
    }

    public static Cocina obtenerInstancia(){
        if(instanciaCocina == null){
            instanciaCocina = new Cocina();
        }
        return instanciaCocina;
    }

    private Cocina(String especialidad, String direccion, String telefono, String jefeCocina) {
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.jefeCocina = jefeCocina;

        repositorioIngrediente = new RepositorioIngredienteImplementación();
        inventarioIngredientes = repositorioIngrediente.cargarIngredientes();
    }

    public  Plato cocinar(Receta receta,String tipoPlato){

        plato = null;

        if(verificarSiSePreparaElPlato(receta)){
            plato = PlatoFactory.obtenerPlato(tipoPlato);
            plato.setPrecio(receta.getPrecio());
        }
        return plato;
    }

    private boolean verificarSiSePreparaElPlato(Receta receta){
        List<Ingrediente> ingredientesParaReceta = receta.obtenerIngredientes();

        int conteo = 0;
        for(Ingrediente ingredienteParaPlato : ingredientesParaReceta){
            for(int i = 0; i < inventarioIngredientes.size(); i++){
                if(ingredienteParaPlato.obtenerNombreIngrediente().equals(inventarioIngredientes.get(i).obtenerNombreIngrediente())){
                    inventarioIngredientes.get(i).asignarCantidad(inventarioIngredientes.get(i).obtenerCantidad() - ingredienteParaPlato.obtenerCantidad());
                    if(inventarioIngredientes.get(i).obtenerCantidad() >= 0){
                        conteo++;
                    }
                }
            }
        }
        if(conteo == ingredientesParaReceta.size()){
            return true;
        }
        return false;
    }
}
