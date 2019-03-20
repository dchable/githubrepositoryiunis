package controller;

import Entidades.Categoria;
import Services.CategoriaService;
import Services.CategoriaServiceImpl;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Iterator;

public class CategoriaController{

    public void guardarCategoria(Categoria categoria){

        //Llame a la interfaz  y la instancia se hace con la omplementacion
        CategoriaService categoriaService = new CategoriaServiceImpl();
        categoriaService.crearCategoria(categoria);
    }


    /**
     * Metodo que muestra las categorias
     *
     */

    public void mostrarCategorias(){
        CategoriaService categoriaService = new CategoriaServiceImpl();
        ArrayList<Categoria> mostrarLaLista = categoriaService.buscarCategorias();

        for (Categoria elementoLista : mostrarLaLista) {
            System.out.println("elementoLista = " + elementoLista.getId());
            System.out.println("elementoLista = " + elementoLista.getDescripcion());
        }

    }


    public void busquedaCategorias(DefaultTableModel defaultTableModel){
        String[] datos={};
        String[] nombreColumnas = {"ID", "DESCRIPCION"};


        for (String nombreColumna : nombreColumnas) {
            defaultTableModel.addColumn(nombreColumna);
        }


        CategoriaService categoriaService = new CategoriaServiceImpl();
        ArrayList<Categoria> mostrarLista = categoriaService.buscarCategorias();

        for (Categoria categoria : mostrarLista) {
            datos = new String[]{String.valueOf(categoria.getId()), categoria.getDescripcion()};
            defaultTableModel.addRow(datos);
        }



    }




}
