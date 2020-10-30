package tarea_misprimerasgui.panels;

import tarea_misprimerasgui.Main;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class DocumentosConsignados extends JPanel {

    JCheckBox cb_fondonegro, cb_notascert, cb_partnacimiento, cb_cedula;

    public DocumentosConsignados(Main main) {
        GridLayout layout = new GridLayout(4,1,5,5);
        setBorder(new TitledBorder("Documentos Cosignados"));
        setLayout(layout);

        cb_fondonegro = new JCheckBox("Titulo en Fondo Negro");
        cb_notascert  = new JCheckBox("Notas Certificadas");
        cb_partnacimiento = new JCheckBox("Partida de Nacimiento");
        cb_cedula     = new JCheckBox("Copia de la Cedula");

        add(cb_fondonegro);
        add(cb_notascert);
        add(cb_partnacimiento);
        add(cb_cedula);
    }
}
