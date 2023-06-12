package br.com.freitas_store.ctr;

import br.com.freitas_store.dao.ConexaoDAO;
import br.com.freitas_store.dto.RoupasDTO;
import br.com.freitas_store.dao.RoupasDAO;
import br.com.freitas_store.dto.FornecedorDTO;
import java.sql.ResultSet;

public class RoupasCTR {

    RoupasDAO roupasDAO = new RoupasDAO();

    public RoupasCTR() {
    }

    public String inserir_roupas(RoupasDTO roupasDTO, FornecedorDTO fornecedorDTO) {
        if (roupasDAO.inserir_roupas(roupasDTO, fornecedorDTO)) {
            return "Roupa inserida com sucesso! ";
        } else {
            return "Roupa não inserida! ";
        }
    }

    public String alterar_roupas(RoupasDTO roupasDTO, FornecedorDTO fornecedorDTO) {
        if (roupasDAO.alterar_roupas(roupasDTO, fornecedorDTO)) {
            return "Roupa alterada com sucesso! ";
        } else {
            return "Roupa não alterada! ";
        }
    }

    public String excluir_roupas(RoupasDTO roupasDTO) {
        if (roupasDAO.excluir_roupas(roupasDTO)) {
            return "Roupa excluída com sucesso! ";
        } else {
            return "Roupa não excluída! ";
        }
    }

    public ResultSet consultar_roupas(RoupasDTO roupasDTO, int opcao) {
        return roupasDAO.consultar_roupas(roupasDTO, opcao);
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
