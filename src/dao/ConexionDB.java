package dao;

import Keys.ConfigDataBaseInfoKey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB{
    Connection miconexion = null;


    public   Connection establecerConexion(){


        try{

            try{
                Class.forName("org.postgresql.Driver");

            }catch (ClassNotFoundException exc){
                System.out.println("no pude cargar el driver = " + exc);
            }


            miconexion = DriverManager.getConnection(ConfigDataBaseInfoKey.urlDB + ConfigDataBaseInfoKey.portDB + "/" + ConfigDataBaseInfoKey.nameDB,ConfigDataBaseInfoKey.userDB,ConfigDataBaseInfoKey.passwordDB );

            boolean conexcionValida = miconexion.isValid(50000);
            System.out.println(conexcionValida ? "conexion valida" : "Conxion Fallida");

        }catch (SQLException sqlExe){
            System.out.println("Error al conectar" + sqlExe);
        }

        return miconexion;
    }







}
