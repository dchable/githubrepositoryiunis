package controller;

import Entidades.Categoria;
import Services.CategoriaService;
import Services.CategoriaServiceImpl;

public class CategoriaController{

    public void guardarCategoria(Categoria categoria){

        //Llame a la interfaz  y la instancia se hace con la omplementacion
        CategoriaService categoriaService = new CategoriaServiceImpl();
        categoriaService.crearCategoria(categoria);
    }

    public void mostrarCategorias(){

    }




}
