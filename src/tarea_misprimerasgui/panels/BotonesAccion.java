package tarea_misprimerasgui.panels;

import tarea_misprimerasgui.Main;

import javax.swing.*;
import java.awt.*;

public class BotonesAccion extends JPanel {

    JButton btn_guardar, btn_limpiar, btn_cancelar;

    public BotonesAccion(Main main) {
        GridLayout layout = new GridLayout(3,1,5,5);
        setLayout(layout);

        btn_guardar = new JButton("GUARDAR");
        btn_limpiar = new JButton("LIMPIAR");
        btn_cancelar = new JButton("CANCELAR");

        add(btn_guardar);
        add(btn_limpiar);
        add(btn_cancelar);
    }
}
