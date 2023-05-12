package br.com.lojadecamisa.servlet.dao;

import br.com.lojadecamisa.servlet.model.Cadastro;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroDao {

    public void createaccount(Cadastro cadastro) {
        String SQL = "INSERT INTO ADMINISTRADOR (NOME, SOBRENOME, EMAIL, SENHA) VALUES (?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadastro.getNome());
            preparedStatement.setString(2, cadastro.getSobrenome());
            preparedStatement.setString(3, cadastro.getEmail());
            preparedStatement.setString(4, cadastro.getSenha());

            preparedStatement.execute();
            connection.close();
        } catch (Exception e) {
            System.out.println("fail in connection");
        }
    }

    public List<Cadastro> findAllCadastro() {

        String sql = "SELECT * FROM ADMINISTRADOR";
        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            List<Cadastro> cadastros = new ArrayList<>();

            while (resultSet.next()) {
                String id = resultSet.getString("ID_ADM");
                String nome = resultSet.getString("NOME");
                String sobrenome = resultSet.getString("SOBRENOME");
                String email = resultSet.getString("EMAIL");
                String senha = resultSet.getString("SENHA");
                Cadastro cadastro = new Cadastro(id,nome, sobrenome, email, senha);
                cadastros.add(cadastro);
            }
            System.out.println("Sucesso in select * adminitralção");
            connection.close();

            return cadastros;
        }catch (Exception e){
            System.out.println("Falha na connection");
            return Collections.emptyList();
        }

    }

    public void deleteCadastroById(String CadastroId) {
        String SQL = "DELETE ADMINISTRADOR WHERE ID_ADM = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, CadastroId);
            preparedStatement.execute();

            System.out.println("success on delete name with id: " + CadastroId);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
        }
    }

    public void updateCadastro(Cadastro cadastro) {

        String SQL ="UPDATE ADMINISTRADOR SET NOME = ?, SOBRENOME = ? WHERE ID_ADM = ?  ";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cadastro.getNome());
            preparedStatement.setString(2, cadastro.getSobrenome());

            preparedStatement.setString(5, cadastro.getId());
            preparedStatement.execute();

            System.out.println("success in update ADMINISTRADOR");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }
    }




}