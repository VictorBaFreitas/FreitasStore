package br.com.freitas_store.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import br.com.freitas_store.dto.FornecedorDTO;

public class FornecedorDAO {

    private ResultSet rs = null;
    private Statement stmt = null;
    SimpleDateFormat data_format = new SimpleDateFormat("yyyy-MM-dd");

    public FornecedorDAO() {
    }

    public boolean inserir_fornecedor(FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "insert into fornecedor (nome_fornecedor, descricao_fornecedor, "
                    + "cnpj_fornecedor, data_fornecedor, cep_fornecedor, estado_fornecedor, "
                    + "cidade_fornecedor, bairro_fornecedor, rua_fornecedor, numero_fornecedor) values ( "
                    + "'" + fornecedorDTO.getNome_fornecedor() + "', "
                    + "'" + fornecedorDTO.getDescricao_fornecedor() + "', "
                    + "'" + fornecedorDTO.getCnpj_fornecedor() + "', "
                    + "to_date('" + data_format.format(fornecedorDTO.getData_fornecedor()) + "','yyyy-MM-dd'), "
                    + "'" + fornecedorDTO.getCep_fornecedor() + "', "
                    + fornecedorDTO.getEstado_fornecedor() + ", "
                    + "'" + fornecedorDTO.getCidade_fornecedor() + "', "
                    + "'" + fornecedorDTO.getBairro_fornecedor() + "', "
                    + "'" + fornecedorDTO.getRua_fornecedor() + "', "
                    + fornecedorDTO.getNumero_fornecedor() + ") ";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();

            comando = "select id_fornecedor from fornecedor where nome_fornecedor ilike '" + fornecedorDTO.getNome_fornecedor() + "%' ";
            rs = stmt.executeQuery(comando.toUpperCase());
            ConexaoDAO.con.commit();

            if (rs.next()) {
                fornecedorDTO.setId_fornecedor(rs.getInt("id_fornecedor"));
            }

            comando = "insert into telefone_fornecedor (telefone_fornecedor, id_fornecedor) values ("
                    + "'" + fornecedorDTO.getTelefone_fornecedor() + "', "
                    + fornecedorDTO.getId_fornecedor() + ") ";
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir! " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean alterar_fornecedor(FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "update telefone_fornecedor set "
                    + "telefone_fornecedor = '" + fornecedorDTO.getTelefone_fornecedor() + "' "
                    + "where id_fornecedor = " + fornecedorDTO.getId_fornecedor();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();

            comando = "update fornecedor set "
                    + "nome_fornecedor = '" + fornecedorDTO.getNome_fornecedor() + "', "
                    + "descricao_fornecedor = '" + fornecedorDTO.getDescricao_fornecedor() + "', "
                    + "cnpj_fornecedor = '" + fornecedorDTO.getCnpj_fornecedor() + "', "
                    + "data_fornecedor = to_date('" + data_format.format(fornecedorDTO.getData_fornecedor()) + "','yyyy-MM-dd'), "
                    + "cep_fornecedor = '" + fornecedorDTO.getCep_fornecedor() + "', "
                    + "estado_fornecedor = " + fornecedorDTO.getEstado_fornecedor() + ", "
                    + "cidade_fornecedor = '" + fornecedorDTO.getCidade_fornecedor() + "', "
                    + "rua_fornecedor = '" + fornecedorDTO.getRua_fornecedor() + "', "
                    + "bairro_fornecedor = '" + fornecedorDTO.getBairro_fornecedor() + "' "
                    + "where id_fornecedor = " + fornecedorDTO.getId_fornecedor();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao alterar! " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean excluir_fornecedor(FornecedorDTO fornecedorDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "delete from telefone_fornecedor where id_fornecedor = " + fornecedorDTO.getId_fornecedor();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();

            comando = "delete from fornecedor where id_fornecedor = " + fornecedorDTO.getId_fornecedor();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public ResultSet consultar_fornecedor(FornecedorDTO fornecedorDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "";

            if (opcao == 1) {
                comando = "select id_fornecedor, nome_fornecedor from fornecedor where nome_fornecedor ilike '"
                        + fornecedorDTO.getNome_fornecedor() + "%' order by nome_fornecedor";
            }

            if (opcao == 2) {
                comando = "select f. *, t.telefone_fornecedor from fornecedor f, "
                        + "telefone_fornecedor t where f.id_fornecedor = t.id_fornecedor "
                        + "and f.id_fornecedor = " + fornecedorDTO.getId_fornecedor();
            }

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
            return rs;
        }
    }
}
