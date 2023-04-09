package br.com.lojadecamisa.servlet.model;

public class Cadastro {

    private String name, sobrenome, email, senha;


    public String getSobrenome(){return sobrenome;}
    public void setSobrenome(String sobrenome){this.sobrenome = sobrenome; }

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email; }

    public String getSenha(){return senha;}
    public void setSenha(String senha){this.senha = senha; }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
