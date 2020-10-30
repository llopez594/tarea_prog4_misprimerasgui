package tarea_misprimerasgui.panels;

import tarea_misprimerasgui.Main;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class LugarNacimiento extends JPanel {

    JComboBox<String> cbox_lugar;

    public LugarNacimiento(Main main) {
        FlowLayout layout = new FlowLayout();
        layout.setVgap(30);
        layout.setHgap(20);
        layout.setAlignment(FlowLayout.CENTER);
        setLayout(layout);
//        setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        setBorder(new TitledBorder("Lugar nacimiento"));

        cbox_lugar = new JComboBox<String>();
        cbox_lugar.setMaximumRowCount(8);
        this.init_estados();

        add(cbox_lugar);
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
