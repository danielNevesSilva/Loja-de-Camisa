package br.com.lojadecamisa.servlet.dao;

import br.com.lojadecamisa.servlet.config.ConnectionPoolConfig;
import br.com.lojadecamisa.servlet.model.Cadastro;
import br.com.lojadecamisa.servlet.model.Post;
import br.com.lojadecamisa.servlet.model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostDao {

    public void post(Post post) {

        String SQL = "INSERT INTO POST (USERNAME, TITLE, BODY, IMAGE) VALUES (?,?,?,?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, post.getUsername());
            preparedStatement.setString(2, post.getTitle());
            preparedStatement.setString(3, post.getBody());
            preparedStatement.setString(4, post.getImage());

            preparedStatement.execute();
            connection.close();
        } catch (Exception e) {
            System.out.println("fail in connection create" + e);
        }
    }

    public List<Post> selectPosts() {

        String SQL = "SELECT * FROM POST";

        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
             PreparedStatement preparedStatement = connection.prepareStatement(SQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            List<Post> post = new ArrayList<>();


            while (resultSet.next()) {
                String id = resultSet.getString("ID_PRODUTO");
                String username = resultSet.getString("USERNAME");
                String title = resultSet.getString("TITLE");
                String body = resultSet.getString("BODY");
                String image = resultSet.getString("IMAGE");

                Post posts = new Post(id,username,title, body, image);

                post.add(posts);
            }
            System.out.println("Sucesso in select * Posts");
            connection.close();

            return post;
        } catch (Exception e) {
            System.out.println("Falha na connection");
            return Collections.emptyList();
        }

    }
}
