package br.com.lojadecamisa.servlet.dao;

import br.com.lojadecamisa.servlet.model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoDao {

    public void createImagem(Produto produto) {

        String SQL = "INSERT INTO PRODUTO  (ANOCAMISA, NOMECAMISA, TAMANHO, PRECO, QUANTIDADE, IMAGE) VALUES (?, ?, ?, ?, ?, ?)";
        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getAnoCamisa());
            preparedStatement.setString(2, produto.getNomeCamisa());
            preparedStatement.setString(3, produto.getTamanho());
            preparedStatement.setString(4, produto.getValorProduto());
            preparedStatement.setString(5, produto.getQuantidade());
            preparedStatement.setString(6, produto.getImage());
            preparedStatement.executeUpdate();

            System.out.println("success in insert PRODUTO");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }
    }

    public List<Produto> selectProdutos() {

        String SQL = "SELECT * FROM PRODUTO";

        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
             PreparedStatement preparedStatement = connection.prepareStatement(SQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            List<Produto> produto = new ArrayList<>();


            while (resultSet.next()) {
                String id = resultSet.getString("ID_PRODUTO");
                String anoCamisa = resultSet.getString("ANOCAMISA");
                String nomeCamisa = resultSet.getString("NOMECAMISA");
                String tamanho = resultSet.getString("TAMANHO");
                String preco = resultSet.getString("PRECO");
                String quantidade = resultSet.getString("QUANTIDADE");
                String image = resultSet.getString("IMAGE");

                Produto produtos = new Produto(id, anoCamisa, nomeCamisa, tamanho, preco, quantidade, image);

                produto.add(produtos);
            }
            System.out.println("Sucesso in select * Produto");
            connection.close();

            return produto;
        } catch (Exception e) {
            System.out.println("Falha na connection");
            return Collections.emptyList();
        }

    }

    public void deleteProdutoById(String ProdutoId) {
        String SQL = "DELETE PRODUTO WHERE ID_PRODUTO = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, ProdutoId);
            preparedStatement.execute();

            System.out.println("success on delete name with id: " + ProdutoId);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
        }
    }


    public void updateProduto(Produto produto) {

        String SQL = "UPDATE PRODUTO SET ANOCAMISA = ?, NOMECAMISA = ? WHERE ID_PRODUTO = ?  ";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getAnoCamisa());
            preparedStatement.setString(2, produto.getNomeCamisa());

            preparedStatement.setString(5, produto.getId());
            preparedStatement.execute();

            System.out.println("success in update PRODUTO");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }
    }

}
