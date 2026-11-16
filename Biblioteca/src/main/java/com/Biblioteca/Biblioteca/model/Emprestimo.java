package com.Biblioteca.Biblioteca.model;

public class Emprestimo {
    private String dataemprestimo;
    private String datadevolucao;
    private String livroemprestado;

    public String getDataemprestimo() {
        return dataemprestimo;
    }

    public void setDataemprestimo(String dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }

    public String getDatadevolucao() {
        return datadevolucao;
    }

    public void setDatadevolucao(String datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

    public String getLivroemprestado() {
        return livroemprestado;
    }

    public void setLivroemprestado(String livroemprestado) {
        this.livroemprestado = livroemprestado;
    }
}
