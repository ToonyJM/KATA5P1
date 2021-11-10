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
        
        
        String sql = "SELECT * FROM PEOPLE";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
// Bucle sobre el conjunto de registros.
        System.out.println("Mostrando los registro de la tabla PEOPLE: ");
        while (rs.next()) {
            System.out.println(rs.getInt("Id") + "\t"
            + rs.getString("Nombre") + "\t"
            + rs.getString("Apellidos") + "\t"
            + rs.getString("Departamento") + "\t");
        }
        System.out.println("----------FINALIZADO----------");
        
// Cerramos conexión con la base de datos
        conn.close();
    }
}
