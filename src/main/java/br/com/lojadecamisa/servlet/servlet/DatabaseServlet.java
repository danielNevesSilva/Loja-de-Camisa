package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.config.ConnectionPoolConfig;
import org.h2.tools.RunScript;

import javax.servlet.annotation.WebServlet;
import java.io.FileReader;
import java.sql.Connection;

@WebServlet(loadOnStartup = 1)
public class DatabaseServlet {

    public DatabaseServlet() {
        loadDatabase();
    }

    public void loadDatabase() {

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            RunScript.execute(connection, new FileReader("src/main/resources/db.sql"));

            System.out.println("Success on load database tables");

        } catch (Exception e) {

            System.out.println("Failed on load database tables");
            System.out.printf("Cause: " + e.getMessage());

        }

    }



}
