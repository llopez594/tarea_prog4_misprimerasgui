package tarea_misprimerasgui.panels;

import javax.swing.*;
import java.awt.*;

public class TituloPrincipal extends JPanel {

    public TituloPrincipal() {
        FlowLayout layout = new FlowLayout();
        layout.setVgap(20);
        layout.setAlignment(FlowLayout.CENTER);
        setLayout(layout);

        JLabel titulo = new JLabel("REGISTRO ESTUDIANTE");

        add(titulo);
    }
}