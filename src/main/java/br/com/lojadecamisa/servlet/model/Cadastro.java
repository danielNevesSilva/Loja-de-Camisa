package br.com.lojadecamisa.servlet.model;

public class Cadastro {

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;

    private  String Id;


    public Cadastro(String id, String nome, String sobrenome, String email, String senha) {
        this.Id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
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
}



