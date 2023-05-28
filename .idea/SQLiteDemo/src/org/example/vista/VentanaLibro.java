package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaLibro extends JFrame {
    private JLabel lblId;
    private JLabel lblTitulo;
    private JLabel lblAutor;
    private JTextField txtId;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private  JButton brnAgregar;
    private  JButton brnCargar;
    private JTable tblLibro;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1; // formulario para capturar libros
    private JPanel panel2; // Tabla para mostrar los libros
    private JPanel panel3; // ?
    private JPanel panel4; // ?


    public VentanaLibro(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        // panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(239, 200, 200));
        lblId = new JLabel("Id:");
        lblTitulo = new JLabel("Titulo:");
        lblAutor = new JLabel("Autor:");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtTitulo = new JTextField(10);
        txtAutor = new JTextField(15);
        brnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblTitulo);
        panel1.add(txtTitulo);
        panel1.add(lblAutor);
        panel1.add(txtAutor);
        panel1.add(brnAgregar);




        // panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(209, 241, 193));
        brnCargar = new JButton("Cargar");
        panel2.add(brnCargar);
        tblLibro = new JTable();
        scrollPane = new JScrollPane(tblLibro);
        panel2.add(scrollPane);


        // panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(200, 239, 239));

        // panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(213, 200, 239));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblAutor() {
        return lblAutor;
    }

    public void setLblAutor(JLabel lblAutor) {
        this.lblAutor = lblAutor;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }



    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBrnCargar() {
        return brnCargar;
    }

    public void setBrnCargar(JButton brnCargar) {
        this.brnCargar = brnCargar;
    }
}