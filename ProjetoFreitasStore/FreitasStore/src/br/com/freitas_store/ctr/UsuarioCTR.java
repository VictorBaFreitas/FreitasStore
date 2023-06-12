package br.com.freitas_store.ctr;

import br.com.freitas_store.dao.UsuarioDAO;
import br.com.freitas_store.dto.UsuarioDTO;
import br.com.freitas_store.dao.ConexaoDAO;
import java.sql.ResultSet;

public class UsuarioCTR {

    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public UsuarioCTR() {

    }

    public String inserir_usuario(UsuarioDTO usuarioDTO) {
        if (usuarioDAO.inserir_usuario(usuarioDTO)) {
            return "Usuário inserido com sucesso! ";
        } else {
            return "Usuário não inserido! ";
        }
    }

    public String alterar_usuario(UsuarioDTO usuarioDTO) {
        if (usuarioDAO.alterar_usuario(usuarioDTO)) {
            return "Usuário alterado com sucesso! ";
        } else {
            return "Usuário não alterado! ";
        }
    }

    public String excluir_usuario(UsuarioDTO usuarioDTO) {
        if (usuarioDAO.excluir_usuario(usuarioDTO)) {
            return "Usuário excluído com sucesso! ";
        } else {
            return "Usuário não excluído! ";
        }
    }

    public ResultSet consultar_usuario(UsuarioDTO usuarioDTO, int opcao) {
        return usuarioDAO.consultar_usuario(usuarioDTO, opcao);
    }

    public int logar_usuario(UsuarioDTO usuarioDTO) {
        return usuarioDAO.logar_usuario(usuarioDTO);
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
