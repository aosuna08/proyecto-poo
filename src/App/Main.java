package App;

import GUI.VistaLogin;
import java.sql.Connection;

public class Main {
   public static void main(String[] args) {
       // Ejecuta la ventana de login
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }
}
