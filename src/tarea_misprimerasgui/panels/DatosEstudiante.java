package tarea_misprimerasgui.panels;

import tarea_misprimerasgui.Main;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatosEstudiante extends JPanel {

    JTextField tfiel_nombre, tfiel_apellido, tfiel_cedula, tfiel_edad;
    JFormattedTextField tfiel_fecNac;
    JRadioButton rb_masculino, rb_femenino;
    JComboBox<String> cbox_lugar;

    public DatosEstudiante(Main main) {
        GridLayout layout = new GridLayout(7,2,5,5);
        setBorder(new TitledBorder("Datos estudiantes"));
        setLayout(layout);

        tfiel_nombre   = new JTextField(12);
        tfiel_apellido = new JTextField(12);
        tfiel_cedula   = new JTextField(12);
        tfiel_fecNac   = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
        tfiel_fecNac.setValue(new Date());
        tfiel_edad     = new JTextField(12);
        cbox_lugar = new JComboBox<String>();
        cbox_lugar.setMaximumRowCount(6);
        rb_masculino   = new JRadioButton("Hombre");
        rb_femenino    = new JRadioButton("Mujer");
        rb_masculino.setSelected(true);
        this.init_estados();

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb_masculino);
        bg.add(rb_femenino);

        JPanel panel_bg = new JPanel(new GridLayout(1,2));
        panel_bg.add(rb_masculino);
        panel_bg.add(rb_femenino);

        add(new JLabel("Nombre: "));   add(tfiel_nombre);
        add(new JLabel("Apellido: ")); add(tfiel_apellido);
        add(new JLabel("Cedula: "));   add(tfiel_cedula);
        add(new JLabel("Fecha de Naciomiento: ")); add(tfiel_fecNac);
        add(new JLabel("Lugar de Nacimiento: "));  add(cbox_lugar);
        add(new JLabel("Edad: "));     add(tfiel_edad);
        add(new JLabel("Sexo: "));     add(panel_bg);

        tfiel_nombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (Character.isDigit(caracter)) {
                    e.consume(); // ignorar el evento de teclado
                    getToolkit().beep();
                }
            }
        });

        tfiel_apellido.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (Character.isDigit(caracter)) {
                    e.consume(); // ignorar el evento de teclado
                    getToolkit().beep();
                }
            }
        });

        tfiel_cedula.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                    getToolkit().beep();
                }
            }
        });

        tfiel_edad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                    getToolkit().beep();
                }
            }
        });
    }

    void init_estados() {
        cbox_lugar.addItem("Apure");
        cbox_lugar.addItem("Monagas");
        cbox_lugar.addItem("Anzoategui");
        cbox_lugar.addItem("Bolivar");
        cbox_lugar.addItem("Tachira");
        cbox_lugar.addItem("Distrito Capital");
        cbox_lugar.addItem("Miranda");
        cbox_lugar.addItem("Aragua");
        cbox_lugar.addItem("Guarico");
        cbox_lugar.addItem("Cojedes");
        cbox_lugar.addItem("Vargas");
        cbox_lugar.addItem("Nueva Esparta");
        cbox_lugar.addItem("Delta Amacuro");
        cbox_lugar.addItem("Sucre");
        cbox_lugar.addItem("Amazonas");
        cbox_lugar.addItem("Barinas");
        cbox_lugar.addItem("Trujillo");
        cbox_lugar.addItem("Falcon");
        cbox_lugar.addItem("Merida");
        cbox_lugar.addItem("Carabobo");
        cbox_lugar.addItem("Zulia");
        cbox_lugar.addItem("Portuguesa");
        cbox_lugar.addItem("Aragua");
        cbox_lugar.addItem("Lara");
    }
}
