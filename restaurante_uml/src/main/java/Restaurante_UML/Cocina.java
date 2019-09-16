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

    protected Restaurante restaurante;
    protected IRepositorioIngrediente repositorioIngrediente;

    private List<Ingrediente> inventarioIngredientes = new ArrayList<>();

    private Plato plato;

    public Cocina(){
        repositorioIngrediente = new RepositorioIngredienteImplementación();
        inventarioIngredientes = repositorioIngrediente.cargarIngredientes();
    }

    public Cocina(String especialidad, String direccion, String telefono, String jefeCocina) {
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.jefeCocina = jefeCocina;

        repositorioIngrediente = new RepositorioIngredienteImplementación();
        inventarioIngredientes = repositorioIngrediente.cargarIngredientes();
    }

    public  Plato cocinar(Receta receta,String tipoPlato){

        Plato plato = PlatoFactory.obtenerPlato(tipoPlato);
        plato.setPrecio(receta.getPrecio());

        return plato;
    }
}
