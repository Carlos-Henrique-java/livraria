package br.com.livraria.ingary.models;

import java.util.Date;

public class Livro {

    private String capa;
    private String titulo;
    private String subtitulo;
    private String autor;
    private String coAutor;
    private String ilustracao;
    private int paginacao;
    private  String editora;
    private String edicao;
    private String anoLancamento;
    private String genero;
    private String idioma;
    private String capaNormalCapaDura;
    private String CodigoBarra;
    private float preco;
    private int estoque;

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCoAutor() {
        return coAutor;
    }

    public void setCoAutor(String coAutor) {
        this.coAutor = coAutor;
    }

    public String getIlustracao() {
        return ilustracao;
    }

    public void setIlustracao(String ilustracao) {
        this.ilustracao = ilustracao;
    }

    public int getPaginacao() {
        return paginacao;
    }

    public void setPaginacao(int paginacao) {
        this.paginacao = paginacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCapaNormalCapaDura() {
        return capaNormalCapaDura;
    }

    public void setCapaNormalCapaDura(String capaNormalCapaDura) {
        this.capaNormalCapaDura = capaNormalCapaDura;
    }

    public String getCodigoBarra() {
        return CodigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        CodigoBarra = codigoBarra;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

}