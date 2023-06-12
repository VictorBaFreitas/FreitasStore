package br.com.freitas_store.ctr;

import br.com.freitas_store.dao.FornecedorDAO;
import br.com.freitas_store.dao.ConexaoDAO;
import br.com.freitas_store.dto.FornecedorDTO;
import java.sql.ResultSet;

public class FornecedorCTR {

    FornecedorDAO fornecedorDAO = new FornecedorDAO();

    public FornecedorCTR() {

    }

    public String inserir_fornecedor(FornecedorDTO fornecedorDTO) {
        if (fornecedorDAO.inserir_fornecedor(fornecedorDTO)) {
            return "Fornecedor inserido com sucesso! ";
        } else {
            return "Fornecedor não inserido! ";
        }
    }

    public String alterar_fornecedor(FornecedorDTO fornecedorDTO) {
        if (fornecedorDAO.alterar_fornecedor(fornecedorDTO)) {
            return "Fornecedor alterado com sucesso! ";
        } else {
            return "Fornecedor não alterado! ";
        }
    }

    public String excluir_fornecedor(FornecedorDTO fornecedorDTO) {
        if (fornecedorDAO.excluir_fornecedor(fornecedorDTO)) {
            return "Fornecedor excluído com sucesso! ";
        } else {
            return "Fornecedor não excluído! ";
        }
    }

    public ResultSet consultar_fornecedor(FornecedorDTO fornecedorDTO, int opcao) {
        return fornecedorDAO.consultar_fornecedor(fornecedorDTO, opcao);
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
