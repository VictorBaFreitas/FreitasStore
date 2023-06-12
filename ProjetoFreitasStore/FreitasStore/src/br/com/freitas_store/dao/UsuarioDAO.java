package br.com.freitas_store.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import br.com.freitas_store.dto.UsuarioDTO;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class UsuarioDAO {

    private static MessageDigest md = null;
    private ResultSet rs = null;
    private Statement stmt = null;
    SimpleDateFormat data_format = new SimpleDateFormat("yyyy-MM-dd");

    public UsuarioDAO() {
    }

    public boolean inserir_usuario(UsuarioDTO usuarioDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "insert into usuario (nome_usuario, login_usuario, senha_usuario, "
                    + "cpf_usuario, tipo_usuario, data_usuario, cep_usuario, estado_usuario, "
                    + "cidade_usuario, bairro_usuario, rua_usuario, numero_usuario) values ( "
                    + "'" + usuarioDTO.getNome_usuario() + "', "
                    + "'" + usuarioDTO.getLogin_usuario() + "', "
                    + "'" + criptografar(usuarioDTO.getSenha_usuario()) + "', "
                    + "'" + usuarioDTO.getCpf_usuario() + "', "
                    + usuarioDTO.getServico_usuario() + ", "
                    + "to_date('" + data_format.format(usuarioDTO.getData_usuario()) + "','yyyy-MM-dd'), "
                    + "'" + usuarioDTO.getCep_usuario() + "', "
                    + usuarioDTO.getEstado_usuario() + ", "
                    + "'" + usuarioDTO.getCidade_usuario() + "', "
                    + "'" + usuarioDTO.getBairro_usuario() + "', "
                    + "'" + usuarioDTO.getRua_usuario() + "', "
                    + usuarioDTO.getNumero_usuario() + ") ";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();

            comando = "select id_usuario from usuario where nome_usuario ilike '" + usuarioDTO.getNome_usuario() + "%' ";
            rs = stmt.executeQuery(comando.toUpperCase());
            ConexaoDAO.con.commit();

            if (rs.next()) {
                usuarioDTO.setId_usuario(rs.getInt("id_usuario"));
            }

            comando = "insert into telefone_usuario (telefone_usuario, id_usuario) values ("
                    + "'" + usuarioDTO.getTelefone_usuario() + "', "
                    + usuarioDTO.getId_usuario() + ") ";
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

    public boolean alterar_usuario(UsuarioDTO usuarioDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "update telefone_usuario set "
                    + "telefone_usuario = '" + usuarioDTO.getTelefone_usuario() + "' "
                    + "where id_usuario = " + usuarioDTO.getId_usuario();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();

            comando = "update usuario set "
                    + "nome_usuario = '" + usuarioDTO.getNome_usuario() + "', "
                    + "login_usuario = '" + usuarioDTO.getLogin_usuario() + "', ";

            if (usuarioDTO.getSenha_usuario() != null) {
                comando += "senha_usuario = '" + criptografar(usuarioDTO.getSenha_usuario()) + "', ";
            }

            comando += "cpf_usuario = '" + usuarioDTO.getCpf_usuario() + "', "
                    + "tipo_usuario = " + usuarioDTO.getServico_usuario() + ", "
                    + "data_usuario = to_date('" + data_format.format(usuarioDTO.getData_usuario()) + "','yyyy-MM-dd'), "
                    + "cep_usuario = '" + usuarioDTO.getCep_usuario() + "', "
                    + "estado_usuario = " + usuarioDTO.getEstado_usuario() + ", "
                    + "cidade_usuario = '" + usuarioDTO.getCidade_usuario() + "', "
                    + "rua_usuario = '" + usuarioDTO.getRua_usuario() + "', "
                    + "bairro_usuario = '" + usuarioDTO.getBairro_usuario() + "' "
                    + "where id_usuario = " + usuarioDTO.getId_usuario();

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

    public boolean excluir_usuario(UsuarioDTO usuarioDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "delete from telefone_usuario where id_usuario = " + usuarioDTO.getId_usuario();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();

            comando = "delete from usuario where id_usuario = " + usuarioDTO.getId_usuario();

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

    public ResultSet consultar_usuario(UsuarioDTO usuarioDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "";

            if (opcao == 1) {
                comando = "select id_usuario, nome_usuario from usuario where nome_usuario ilike '"
                        + usuarioDTO.getNome_usuario() + "%' order by nome_usuario";
            }

            if (opcao == 2) {
                comando = "select u. *, t.telefone_usuario from usuario u, "
                        + "telefone_usuario t where u.id_usuario = t.id_usuario "
                        + "and u.id_usuario = " + usuarioDTO.getId_usuario();
            }

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
            return rs;
        }
    }

    public int logar_usuario(UsuarioDTO usuarioDTO) {
        try {
            ConexaoDAO.ConectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "select tipo_usuario from usuario where login_usuario = '"
                    + usuarioDTO.getLogin_usuario() + "'"
                    + " and senha_usuario = '" + criptografar(usuarioDTO.getSenha_usuario()) + "'";

            rs = stmt.executeQuery(comando.toUpperCase());

            if (rs.next()) {
                return rs.getInt("tipo_usuario");
            } else {
                return -1;
            }

        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
            return -1;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Erro! " + ex.getMessage());
        }
    }

    private static char[] hexCodes(byte[] text) {
        char[] hexOutput = new char[text.length * 3];
        String hexString;

        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            hexString.toUpperCase().getChars(hexString.length() - 3,
                    hexString.length(), hexOutput, i * 3);
        }
        return hexOutput;
    }

    public static String criptografar(String pwd) {
        if (md != null) {
            return new String(hexCodes(md.digest(pwd.getBytes())));
        }
        return null;
    }
}
