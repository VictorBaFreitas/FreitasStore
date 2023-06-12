package br.com.freitas_store.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import br.com.freitas_store.dto.VendaDTO;
import br.com.freitas_store.dto.UsuarioDTO;
import java.sql.SQLException;

public class VendaDAO {

    public VendaDAO() {
    }

    private ResultSet rs = null;
    Statement stmt = null;
    Statement stmt1 = null;
    SimpleDateFormat data_format = new SimpleDateFormat("yyyy-MM-dd");

    public boolean inserir_venda(VendaDTO vendaDTO, UsuarioDTO usuarioDTO, JTable roupas) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            stmt1 = ConexaoDAO.con.createStatement();

            String comando1 = "insert into venda (data_venda, valor_venda, "
                    + "id_usuario) values ( "
                    + "to_date('" + data_format.format(vendaDTO.getData_venda()) + "', 'yyyy-MM-dd'), "
                    + vendaDTO.getValor_venda() + ", "
                    + usuarioDTO.getId_usuario() + ")";

            stmt.execute(comando1.toUpperCase(), Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            rs.next();

            for (int cont = 0; cont < roupas.getRowCount(); cont++) {
                String comando2 = "insert into venda_roupas (id_venda, id_roupas, "
                        + "valor_roupas, quantidade_roupas) values ( "
                        + rs.getInt("id_venda") + ", "
                        + roupas.getValueAt(cont, 0) + ", "
                        + roupas.getValueAt(cont, 2) + ", "
                        + roupas.getValueAt(cont, 3) + "); ";

                stmt1.execute(comando2);
            }
            ConexaoDAO.con.commit();
            stmt.close();
            stmt1.close();
            rs.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
}
