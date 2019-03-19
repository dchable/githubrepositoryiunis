package forms;

import Entidades.Categoria;
import Services.CategoriaServiceImpl;
import controller.CategoriaController;
import forms.KeyForms.MPredVentKey;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoriaForm extends JFrame {

    private JLabel tituloVentana;
    private JTextField txtCategoria;
    private JLabel lblCategoria;
    private JButton btnGuardarCategoria;

    public CategoriaForm(){

        setTitle("CATEGORIA");
        setBounds(MPredVentKey.POSX_INI_VENT, MPredVentKey.POSY_INI_VENT,MPredVentKey.ANCHO_VENTANA, MPredVentKey.ALTURA_VENTANA);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        tituloVentana = new JLabel("CATEGORIA");
        tituloVentana.setBounds(250, 20, 100,20);
        add(tituloVentana);

        lblCategoria = new JLabel("ESCRIBE LA CATEGORIA");
        lblCategoria.setBounds(50, 100, 300, 20);
        add(lblCategoria);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(50, 150, 150, 30);
        add(txtCategoria);

        btnGuardarCategoria = new JButton("GUARDAR CATEGORIA");
        btnGuardarCategoria.setBounds(50, 200, 250, 30);
        add(btnGuardarCategoria);


        btnGuardarCategoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Entidad
                Categoria categoria = new Categoria();
                categoria.setDescripcion(txtCategoria.getText());

                //Controlador
                CategoriaController categoriaController = new CategoriaController();
                categoriaController.guardarCategoria(categoria);


                limpiarCajasDeTexto();


            }
        });




    }


    public void limpiarCajasDeTexto(){
        txtCategoria.setText("");
    }



}
