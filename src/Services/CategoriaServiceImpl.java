package Services;

import Entidades.Categoria;
import dao.CategoriaDAO;

import java.util.ArrayList;

public class CategoriaServiceImpl implements CategoriaService{

    CategoriaDAO categoriaDAO;

    public CategoriaServiceImpl(){
        categoriaDAO = new CategoriaDAO();
    }

    /**
     * Este metodo va a insertar una categoria
     * @param categoria resivimnmos un objeto categortia
     */
    public void crearCategoria(Categoria categoria){
        categoriaDAO.insertarCatgeria(categoria);
    }

   public ArrayList<Categoria> buscarCategorias(){
        return categoriaDAO.buscarTodasLasCategorias();
    }

    
}
