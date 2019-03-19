package forms;

import forms.KeyForms.MPredVentKey;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAppWindow extends JFrame {
    private JPanel contentPanel;
    private JLabel encabezadoTitulo;
    private JButton btnCategorias;

    public MenuAppWindow(){
        setTitle("MENU PUNTO DE VENTA");

        /*
         * definiendo la longitud de mi ventana
         * */
        setBounds(100,100,600,600);
        //Colocar niuestro boton de cerrar
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Haces visible la ventana
        setVisible(true);

        //Crear nuestro panel
        contentPanel = new JPanel();

        //Aca indicamos que diseño
        contentPanel.setLayout(null);

        //Asignarle el contenudo del panel
        setContentPane(contentPanel);


        encabezadoTitulo = new JLabel("MENU");
        encabezadoTitulo.setBounds(250,20,300,30);
        contentPanel.add(encabezadoTitulo);


        btnCategorias = new JButton("CATEGORIA PRODUCTOS");
        btnCategorias.setBounds(250,100,300,20);
        contentPanel.add(btnCategorias);

       /* btnCategorias.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CategoriaForm  categoriaForm = new CategoriaForm();
                categoriaForm.setVisible(true);


            }
        });*/

       btnCategorias.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              CategoriaForm categoriaForm = new CategoriaForm();
              categoriaForm.setVisible(true);
           }
       });


    }


}
