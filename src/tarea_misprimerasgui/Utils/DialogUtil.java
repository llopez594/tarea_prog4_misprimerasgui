package tarea_misprimerasgui.Utils;

import javax.swing.*;

public class DialogUtil {

    public static Boolean dialogPreguntaSiNo(String str)
    {
        int seleccion = JOptionPane.showOptionDialog(
                null,
                str,
                "Selecciona una Opción",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[] {"Si", "No"},
                "Si"
        );

        if(seleccion != -1) {
            return (seleccion + 1) == 1;
        }
        return null;
    }

    public static void dialogMensaje(String str)
    {
        JOptionPane.showMessageDialog(null, str);
    }

    public static void dialogInputLogin()
    {
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        Object[] message = {
                "Username:", username,
                "Password:", password
        };

        int option = JOptionPane.showConfirmDialog(
                null,
                message,
                "Login",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (option == JOptionPane.OK_OPTION) {
            /*if (username.getText().equals("h") && password.getText().equals("h")) {
                System.out.println("Login successful");
            } else {
                System.out.println("login failed");
            }*/
        } else {
            /*System.out.println("Login canceled");*/
        }
    }
}
