package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection cn;
    private static final String url = "jdbc:mysql://localhost:3306/db";
    private static final String usuario = "root"; // CAMBIAR CUANDO ESTEN DEFINIDOS LOS USUARIOS
    private static final String contrasenia = "2023030588"; // CAMBIAR TAMBIEN
    
    public Connection ConectarBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(url, usuario, contrasenia);
            System.out.println("Conexion exitosa");
        }catch (Exception e){
            System.out.println("Conexion fallida" + e);
        }
        return cn;
        
    }
}
