package br.com.freitas_store.ctr;

import br.com.freitas_store.dao.ConexaoDAO;
import br.com.freitas_store.dao.VendaDAO;
import br.com.freitas_store.dto.VendaDTO;
import br.com.freitas_store.dto.UsuarioDTO;
import javax.swing.JTable;

public class VendaCTR {

    VendaDAO vendaDAO = new VendaDAO();

    public VendaCTR() {
    }

    public String inserir_venda(VendaDTO vendaDTO, UsuarioDTO usuarioDTO, JTable produtos) {
        if (vendaDAO.inserir_venda(vendaDTO, usuarioDTO, produtos)) {
            return "Venda cadastrada com sucesso!";
        } else {
            return "Venda não cadastrada! ";
        }
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
