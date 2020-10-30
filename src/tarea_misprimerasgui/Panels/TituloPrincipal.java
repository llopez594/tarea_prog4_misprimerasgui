package tarea_misprimerasgui.Panels;

import javax.swing.*;
import java.awt.*;

public class TituloPrincipal extends JPanel {

    public TituloPrincipal() {
        FlowLayout layout = new FlowLayout();
        layout.setVgap(10);
        layout.setAlignment(FlowLayout.CENTER);
        setLayout(layout);

        JLabel titulo = new JLabel("REGISTRO ESTUDIANTE");

        add(titulo);
    }
}
