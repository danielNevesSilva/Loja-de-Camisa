package br.com.lojadecamisa.servlet.dao;

import br.com.lojadecamisa.servlet.model.Cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CadastroDao {

    public void createaccount(Cadastro cadastro){
        String SQL = "INSERT INTO ADMINISTRADOR (NOME, SOBRENOME, EMAIL, SENHA) VALUES (?,?,?,?)";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");

            System.out.println("success in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadastro.getName());
            preparedStatement.setString(2, cadastro.getSobrenome());
            preparedStatement.setString(3, cadastro.getEmail());
            preparedStatement.setString(4, cadastro.getSenha());

            preparedStatement.execute();
            connection.close();
        }catch (Exception e){
            System.out.println("fail in connection");
        }
    }
}
