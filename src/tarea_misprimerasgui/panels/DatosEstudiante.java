package tarea_misprimerasgui.panels;

import tarea_misprimerasgui.Main;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class DatosEstudiante extends JPanel {

    JTextField tfiel_nombre, tfiel_apellido, tfiel_cedula, tfiel_fecNac, tfiel_edad;
    JRadioButton rb_masculino, rb_femenino;

    public DatosEstudiante(Main main) {
        GridLayout layout = new GridLayout(6,2,5,5);
        setBorder(new TitledBorder("Datos estudiantes"));
        setLayout(layout);

        tfiel_nombre   = new JTextField(12);
        tfiel_apellido = new JTextField(12);
        tfiel_cedula   = new JTextField(12);
        tfiel_fecNac   = new JTextField(12);
        tfiel_edad     = new JTextField(12);
        rb_masculino   = new JRadioButton("Hombre");
        rb_femenino    = new JRadioButton("Mujer");
        rb_masculino.setSelected(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb_masculino);
        bg.add(rb_femenino);

        JPanel panel_bg = new JPanel(new GridLayout(1,2));
        panel_bg.add(rb_masculino);
        panel_bg.add(rb_femenino);

        add(new JLabel("Nombre: "));   add(tfiel_nombre);
        add(new JLabel("Apellido: ")); add(tfiel_apellido);
        add(new JLabel("Cedula: "));   add(tfiel_cedula);
        add(new JLabel("Fecha de naciomiento: ")); add(tfiel_fecNac);
        add(new JLabel("Edad: "));     add(tfiel_edad);
        add(new JLabel("Sexo: "));     add(panel_bg);
    }
}
