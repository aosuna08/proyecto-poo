package App;

import java.sql.Connection;

public class Main {
   public static void main(String[] args) {
        Connection conn = Conexion.getConnection();
        
        /*
        COMPROBAR CONEXION
        if (conn != null) {
            System.out.println("¡Conexión exitosa a la base de datos!");
        } else {
            System.out.println("No se pudo establecer la conexion.");
        }
        */
    }
}
