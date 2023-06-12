package br.com.freitas_store.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public static Connection con = null;

    public ConexaoDAO() {
    }

    public static void ConectDB() {
        try {
            String dsn = "freitas_store";
            String user = "postgres";
            String senha = "postdba";

            DriverManager.registerDriver(new org.postgresql.Driver());

            String url = "jdbc:postgresql://localhost:5432/" + dsn;

            con = DriverManager.getConnection(url, user, senha);

            con.setAutoCommit(false);
            if (con == null) {
                System.out.println("erro ao abrir o banco");
            }
        } catch (SQLException e) {
            System.out.println("Problema ao abrir a base de dados! " + e.getMessage());
        }
    }

    public static void CloseDB() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Problema ao fechar a base de dados! "
                    + e.getMessage());
        }
    }
}
