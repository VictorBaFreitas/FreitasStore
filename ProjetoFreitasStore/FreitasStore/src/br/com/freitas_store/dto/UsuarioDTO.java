package br.com.freitas_store.dto;

import java.util.Date;

public class UsuarioDTO {

    private int id_usuario, estado_usuario, servico_usuario, numero_usuario;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(int estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    public int getServico_usuario() {
        return servico_usuario;
    }

    public void setServico_usuario(int servico_usuario) {
        this.servico_usuario = servico_usuario;
    }

    public int getNumero_usuario() {
        return numero_usuario;
    }

    public void setNumero_usuario(int numero_usuario) {
        this.numero_usuario = numero_usuario;
    }

    public Date getData_usuario() {
        return data_usuario;
    }

    public void setData_usuario(Date data_usuario) {
        this.data_usuario = data_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getLogin_usuario() {
        return login_usuario;
    }

    public void setLogin_usuario(String login_usuario) {
        this.login_usuario = login_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public String getTelefone_usuario() {
        return telefone_usuario;
    }

    public void setTelefone_usuario(String telefone_usuario) {
        this.telefone_usuario = telefone_usuario;
    }

    public String getCep_usuario() {
        return cep_usuario;
    }

    public void setCep_usuario(String cep_usuario) {
        this.cep_usuario = cep_usuario;
    }

    public String getCidade_usuario() {
        return cidade_usuario;
    }

    public void setCidade_usuario(String cidade_usuario) {
        this.cidade_usuario = cidade_usuario;
    }

    public String getRua_usuario() {
        return rua_usuario;
    }

    public void setRua_usuario(String rua_usuario) {
        this.rua_usuario = rua_usuario;
    }

    public String getBairro_usuario() {
        return bairro_usuario;
    }

    public void setBairro_usuario(String bairro_usuario) {
        this.bairro_usuario = bairro_usuario;
    }
    private Date data_usuario;
    private String nome_usuario, login_usuario, senha_usuario, cpf_usuario, telefone_usuario, cep_usuario, cidade_usuario, rua_usuario, bairro_usuario;
}
