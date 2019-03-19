package Services;

import Entidades.Categoria;

import java.util.ArrayList;

public interface CategoriaService{
    void crearCategoria(Categoria categoria);
    ArrayList<Categoria> buscarCategorias();
}
