package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Kata5P1 {

    public static void main(String[] args) throws SQLException {
        
        Connection conn = null;
// parámetros de la BD
        String url = "jdbc:sqlite:KATA5.db";
// creamos una conexión a la BD
        conn = DriverManager.getConnection(url);
        System.out.println("Connexión a SQLite establecida\n");
        
        String sql = "CREATE TABLE IF NOT EXISTS email (\n"
                + " id integer PRIMARY KEY AUTOINCREMENT,\n"
                + " mail text NOT NULL);";
// Creamos la tabla email
        
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        System.out.println("Tabla creada");  
        
// Cerramos conexión con la base de datos
        conn.close();
    }
}
