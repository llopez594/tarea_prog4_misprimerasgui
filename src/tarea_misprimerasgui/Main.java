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
 * @author LjlopezM
 */
public class Main extends JFrame {

    TituloPrincipal tituloPrincipal;
    DatosEstudiante datosEstudiante;
    LugarNacimiento lugarNacimiento;
    EstadoCivil estadoCivil;
    DocumentosConsignados documentosConsignados;
    BotonesAccion botonesAccion;

    GridBagConstraints gbc = new GridBagConstraints();

    public Main() {
        super("Registro Estudiante");
        setBounds(300,200,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout(8,6));
//        contentPane.setLayout(new GridBagLayout());

        //titulo
        tituloPrincipal = new TituloPrincipal();

        //Paneles del medio
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(1,2));
        middlePanel.add(datosEstudiante = new DatosEstudiante(this));//subpanel del medio izquierdo
        middlePanel.add(lugarNacimiento = new LugarNacimiento(this));//subpanel del medio derecho

        // subpanel de agrupacion del panel inferior izquierdo y centro
        JPanel gridPanelInferior = new JPanel();
        gridPanelInferior.setLayout(new GridLayout(1,2));
        gridPanelInferior.add(estadoCivil = new EstadoCivil(this));//subpanel inferior izquierdo
        gridPanelInferior.add(documentosConsignados = new DocumentosConsignados(this));//subpanel inferior centro

        //Paneles inferior
        JPanel bottomPanel = new JPanel();
        middlePanel.setLayout(new GridLayout(1,2));
        bottomPanel.add(gridPanelInferior);
        bottomPanel.add(botonesAccion = new BotonesAccion(this));//subpanel inferior derecho

        contentPane.add(tituloPrincipal, BorderLayout.NORTH);
        contentPane.add(middlePanel, BorderLayout.EAST);
        contentPane.add(bottomPanel, BorderLayout.SOUTH);

        paintComponents(getGraphics());
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
    
}
