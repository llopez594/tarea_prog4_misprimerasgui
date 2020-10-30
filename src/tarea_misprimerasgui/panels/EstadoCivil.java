package tarea_misprimerasgui.panels;

import tarea_misprimerasgui.Main;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class EstadoCivil extends JPanel {

    JRadioButton rb_soltero, rb_casado, rb_divorciado, rb_viudo;

    public EstadoCivil(Main main) {
        GridLayout layout = new GridLayout(4,1,5,5);
        setBorder(new TitledBorder("Estado Civil"));
        setLayout(layout);

        rb_soltero    = new JRadioButton("Soltero (a)");
        rb_casado     = new JRadioButton("Casado (a)");
        rb_divorciado = new JRadioButton("Divorciado (a)");
        rb_viudo      = new JRadioButton("Viudo (a)");
        rb_soltero.setSelected(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb_soltero);
        bg.add(rb_casado);
        bg.add(rb_divorciado);
        bg.add(rb_viudo);

        add(rb_soltero);
        add(rb_casado);
        add(rb_divorciado);
        add(rb_viudo);
    }
}
