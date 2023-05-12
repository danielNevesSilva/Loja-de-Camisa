package br.com.lojadecamisa.servlet.model;

public class Cadastro {

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;

    private String imagem;

    private  String Id;

    private String anoCamisa;
    private String nomeCamisa;
    private String valorProduto;
    private String quantidade;



    public Cadastro(String id, String anoCamisa, String nomeCamisa, String valorProduto, String quantidade, String imagem) {
        this.Id = id;
        this.anoCamisa = anoCamisa;
        this.nomeCamisa = nomeCamisa;
        this.valorProduto = valorProduto;
        this.quantidade = quantidade;
        this.imagem = imagem;
    }


    public Cadastro(String id, String nome, String sobrenome, String email, String senha) {
        this.Id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
    }


    public String getAnoCamisa() {
        return anoCamisa;
    }

    public void setAnoCamisa(String anoCamisa) {
        this.anoCamisa = anoCamisa;
    }

    public String getNomeCamisa() {
        return nomeCamisa;
    }

    public void setNomeCamisa(String nomeCamisa) {
        this.nomeCamisa = nomeCamisa;
    }

    public String getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(String valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public  String getId(){
        return Id;
    }
    public String getImagem(){ return imagem; }
}



