package controller;

import Entidades.Categoria;
import Services.CategoriaService;
import Services.CategoriaServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;

public class CategoriaController{

    public void guardarCategoria(Categoria categoria){

        //Llame a la interfaz  y la instancia se hace con la omplementacion
        CategoriaService categoriaService = new CategoriaServiceImpl();
        categoriaService.crearCategoria(categoria);
    }

    public void mostrarCategorias(){
        CategoriaService categoriaService = new CategoriaServiceImpl();
        ArrayList<Categoria> mostrarLaLista = categoriaService.buscarCategorias();

        for (Categoria elementoLista : mostrarLaLista) {
            System.out.println("elementoLista = " + elementoLista.getId());
            System.out.println("elementoLista = " + elementoLista.getDescripcion());
        }




    }




}
