package pruebaproyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BD {

    Connection conn;
    PreparedStatement ps;

    public boolean conectar() {
        boolean respuesta = false;

        String bd = "proyectoturismo";
        String login = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/" + bd;

        try {
            conn = DriverManager.getConnection(url, login, password);

            if (conn != null) {
                respuesta = true;
            }

        } catch (SQLException ex) {
            String hola = ("Hubo un problema al intentar conectarse con la base de datos " + url);
            respuesta = false;
        } catch (Exception e) {
            System.out.println(e);
            respuesta = false;

        }
        return respuesta;

    }

    public String insertar(String text, String text2, String text3) throws SQLException {
        String sql = "";
        if (conn != null) {
        }

        sql = "INSERT INTO "
                + " persona(usuario, dni, Email) "
                + " VALUES (?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, text);
        ps.setString(2, text2);
        ps.setString(3, text3);

        int numFilas = ps.executeUpdate();

        return sql;
    }
}
