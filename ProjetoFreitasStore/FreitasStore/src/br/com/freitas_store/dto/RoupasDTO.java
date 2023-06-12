package br.com.freitas_store.dto;

import java.util.Date;

public class RoupasDTO {

    private int id_roupas, tamanho_roupas, cor_roupas;
    private String descricao_roupas;
    private Date data_roupas;
    private double preco_custo_roupas, preco_venda_roupas;

    public int getId_roupas() {
        return id_roupas;
    }

    public void setId_roupas(int id_roupas) {
        this.id_roupas = id_roupas;
    }

    public int getTamanho_roupas() {
        return tamanho_roupas;
    }

    public void setTamanho_roupas(int tamanho_roupas) {
        this.tamanho_roupas = tamanho_roupas;
    }

    public int getCor_roupas() {
        return cor_roupas;
    }

    public void setCor_roupas(int cor_roupas) {
        this.cor_roupas = cor_roupas;
    }

    public String getDescricao_roupas() {
        return descricao_roupas;
    }

    public void setDescricao_roupas(String descricao_roupas) {
        this.descricao_roupas = descricao_roupas;
    }

    public Date getData_roupas() {
        return data_roupas;
    }

    public void setData_roupas(Date data_roupas) {
        this.data_roupas = data_roupas;
    }

    public double getPreco_custo_roupas() {
        return preco_custo_roupas;
    }

    public void setPreco_custo_roupas(double preco_custo_roupas) {
        this.preco_custo_roupas = preco_custo_roupas;
    }

    public double getPreco_venda_roupas() {
        return preco_venda_roupas;
    }

    public void setPreco_venda_roupas(double preco_venda_roupas) {
        this.preco_venda_roupas = preco_venda_roupas;
    }
}
