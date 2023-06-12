package br.com.freitas_store.dao;

import br.com.freitas_store.dto.RoupasDTO;
import br.com.freitas_store.dto.FornecedorDTO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class RoupasDAO {

    private ResultSet rs = null;
    private Statement stmt = null;
    SimpleDateFormat data_format = new SimpleDateFormat("yyyy-MM-dd");

    public RoupasDAO() {
    }

    public boolean inserir_roupas(RoupasDTO roupasDTO, FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "insert into roupas (descricao_roupas, tamanho_roupas, "
                    + "cor_roupas, preco_custo_roupas, preco_venda_roupas, data_roupas, id_fornecedor) values ( "
                    + "'" + roupasDTO.getDescricao_roupas() + "', "
                    + roupasDTO.getTamanho_roupas() + ", "
                    + roupasDTO.getCor_roupas() + ", "
                    + roupasDTO.getPreco_custo_roupas() + ", "
                    + roupasDTO.getPreco_venda_roupas() + ", "
                    + "to_date('" + data_format.format(roupasDTO.getData_roupas()) + "','yyyy-MM-dd'), "
                    + fornecedorDTO.getId_fornecedor() + ") ";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean alterar_roupas(RoupasDTO roupasDTO, FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "update roupas set "
                    + "descricao_roupas = '" + roupasDTO.getDescricao_roupas() + "', "
                    + "tamanho_roupas = " + roupasDTO.getTamanho_roupas() + ", "
                    + "cor_roupas = " + roupasDTO.getCor_roupas() + ", "
                    + "preco_custo_roupas = " + roupasDTO.getPreco_custo_roupas() + ", "
                    + "preco_venda_roupas = " + roupasDTO.getPreco_venda_roupas() + ", "
                    + "data_roupas = to_date('" + data_format.format(roupasDTO.getData_roupas()) + "','yyyy-MM-dd'), "
                    + "id_fornecedor = " + fornecedorDTO.getId_fornecedor() + " "
                    + "where id_roupas = " + roupasDTO.getId_roupas();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean excluir_roupas(RoupasDTO roupasDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Delete from roupas where id_roupas = "
                    + roupasDTO.getId_roupas();

            stmt.execute(comando);
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public ResultSet consultar_roupas(RoupasDTO roupasDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";
            switch (opcao) {
                case 1:
                    comando = "Select * from roupas "
                            + "where descricao_roupas ilike '" + roupasDTO.getDescricao_roupas() + "%' "
                            + "order by descricao_roupas";
                    break;
                case 2:
                    comando = "Select r. *, f.nome_fornecedor, f.id_fornecedor "
                            + "from roupas r, fornecedor f "
                            + "where r.id_fornecedor = f.id_fornecedor and "
                            + "r.id_roupas = " + roupasDTO.getId_roupas();
                    break;

            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
}
