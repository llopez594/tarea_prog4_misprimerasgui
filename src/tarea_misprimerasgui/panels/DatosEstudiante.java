package tarea_misprimerasgui.panels;

import tarea_misprimerasgui.Main;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;

public class DatosEstudiante extends JPanel {

    JTextField tfiel_nombre, tfiel_apellido, tfiel_cedula, tfiel_fecNac, tfiel_edad;
    JRadioButton rb_masculino, rb_femenino;
    JComboBox<String> cbox_lugar;

    public DatosEstudiante(Main main) {
        GridLayout layout = new GridLayout(7,2,5,5);
        setBorder(new TitledBorder("Datos estudiantes"));
        setLayout(layout);

        tfiel_nombre   = new JTextField(12);
        tfiel_apellido = new JTextField(12);
        tfiel_cedula   = new JTextField(12);
        tfiel_fecNac   = new JTextField(12);
        tfiel_edad     = new JTextField(12);
//        tfiel_edad     = new JFormattedTextField(this.onlyNumber());
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

    NumberFormatter onlyNumber() {
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0); //valor mínimo
        formatter.setMaximum(99); //valor máximo
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        return formatter;
    }
}
