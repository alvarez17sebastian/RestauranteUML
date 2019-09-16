package Restaurante_UML.repositorio.menu;

import Restaurante_UML.Receta;

import java.util.List;

public interface IRepositorioMenu {
    List<Receta> cargarRecetas();
}
