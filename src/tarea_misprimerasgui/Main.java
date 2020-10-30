/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_misprimerasgui;

import tarea_misprimerasgui.panels.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Luis J. Lopez M.
 */
public class Main extends JFrame {

    Container contentPane;
    TituloPrincipal tituloPrincipal;
    DatosEstudiante datosEstudiante;
    EstadoCivil estadoCivil;
    DocumentosConsignados documentosConsignados;
    BotonesAccion botonesAccion;

    public Main() {
        super("Registro Estudiante");
        setSize(500, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        //contenedor principal
        contentPane = this.getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //instaciamos los paneles
        tituloPrincipal = new TituloPrincipal();
        datosEstudiante = new DatosEstudiante(this);
        estadoCivil     = new EstadoCivil(this);
        documentosConsignados = new DocumentosConsignados(this);
        botonesAccion   = new BotonesAccion(this);

        this.addPaneltoContent(tituloPrincipal, 0, 0, 2, 1, "h");
        this.addPaneltoContent(datosEstudiante, 0, 1, 1, 3, "v");
        this.addPaneltoContent(estadoCivil, 1, 1);
        this.addPaneltoContent(documentosConsignados, 1, 2);
        this.addPaneltoContent(botonesAccion, 1, 3);

        paintComponents(getGraphics());
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

    void addPaneltoContent(Component comp, int gridx, int gridy) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        contentPane.add(comp, gbc);
    }

    void addPaneltoContent(Component comp, int gridx, int gridy, int gridWith, int gridHeigh, String fill) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = (fill.equals("h")) ? GridBagConstraints.HORIZONTAL : GridBagConstraints.VERTICAL;
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridWith;
        gbc.gridheight = gridHeigh;
        contentPane.add(comp, gbc);
    }
    
}
