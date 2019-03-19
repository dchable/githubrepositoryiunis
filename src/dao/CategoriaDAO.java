package dao;

import Entidades.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CategoriaDAO extends ConexionDB{


    /**
     * insertar una catgregoria
     * @param categoria los datos de la categoria(es un objeto)
     */

    public void insertarCatgeria(Categoria categoria){
        Connection connection = null;
        Statement statement = null;
        connection = establecerConexion();

        String querySQL = "INSERT INTO CATEGORIA(descripcion) VALUES ('"+categoria.getDescripcion()+"') ";


        try {

            statement = connection.createStatement();
            statement.executeQuery(querySQL);
            statement.close();
            connection.commit();
            connection.close();


        }catch (Exception miExepcion){
            System.err.println(miExepcion.getClass().getName() + "-" + miExepcion.getMessage());

        }

    }//FIN DE METODO insertarCatgeria

    /**
     * Buscar categorias
     * @return lista de categorias.
     */

    public ArrayList<Categoria> buscarTodasLasCategorias(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String querySQL = "SELECT * FROM CATEGORIA";
        ArrayList<Categoria> listaCegorias = new ArrayList<Categoria>();

        try {
            connection = establecerConexion();
            preparedStatement = connection.prepareStatement(querySQL);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Categoria categoria = new Categoria();
                categoria.setId(resultSet.getInt("id"));
                categoria.setDescripcion(resultSet.getString("descripcion"));
                listaCegorias.add(categoria);


            }



        }catch (Exception miExepcion){
            System.err.println(miExepcion.getClass().getName() + "-" + miExepcion.getMessage());
        }

            return listaCegorias;

    }


}