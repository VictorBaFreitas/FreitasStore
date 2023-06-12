package br.com.freitas_store.dto;

import java.util.Date;

public class FornecedorDTO {

    private String nome_fornecedor, descricao_fornecedor, cnpj_fornecedor, cep_fornecedor, cidade_fornecedor, rua_fornecedor, bairro_fornecedor, telefone_fornecedor;
    private int id_fornecedor, numero_fornecedor, estado_fornecedor;
    private Date data_fornecedor;

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getDescricao_fornecedor() {
        return descricao_fornecedor;
    }

    public void setDescricao_fornecedor(String descricao_fornecedor) {
        this.descricao_fornecedor = descricao_fornecedor;
    }

    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    public void setCnpj_fornecedor(String cnpj_fornecedor) {
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

    public String getCep_fornecedor() {
        return cep_fornecedor;
    }

    public void setCep_fornecedor(String cep_fornecedor) {
        this.cep_fornecedor = cep_fornecedor;
    }

    public String getCidade_fornecedor() {
        return cidade_fornecedor;
    }

    public void setCidade_fornecedor(String cidade_fornecedor) {
        this.cidade_fornecedor = cidade_fornecedor;
    }

    public String getRua_fornecedor() {
        return rua_fornecedor;
    }

    public void setRua_fornecedor(String rua_fornecedor) {
        this.rua_fornecedor = rua_fornecedor;
    }

    public String getBairro_fornecedor() {
        return bairro_fornecedor;
    }

    public void setBairro_fornecedor(String bairro_fornecedor) {
        this.bairro_fornecedor = bairro_fornecedor;
    }

    public String getTelefone_fornecedor() {
        return telefone_fornecedor;
    }

    public void setTelefone_fornecedor(String telefone_fornecedor) {
        this.telefone_fornecedor = telefone_fornecedor;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getNumero_fornecedor() {
        return numero_fornecedor;
    }

    public void setNumero_fornecedor(int numero_fornecedor) {
        this.numero_fornecedor = numero_fornecedor;
    }

    public int getEstado_fornecedor() {
        return estado_fornecedor;
    }

    public void setEstado_fornecedor(int estado_fornecedor) {
        this.estado_fornecedor = estado_fornecedor;
    }

    public Date getData_fornecedor() {
        return data_fornecedor;
    }

    public void setData_fornecedor(Date data_fornecedor) {
        this.data_fornecedor = data_fornecedor;
    }
}
