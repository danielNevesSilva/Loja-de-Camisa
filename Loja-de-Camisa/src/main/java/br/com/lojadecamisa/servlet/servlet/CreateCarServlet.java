package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.model.Cadastro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/create-account")
public class CreateCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nome = req.getParameter("nome_cad");
        String sobrenome = req.getParameter("sobrenome_cad");
        String email = req.getParameter("email_cad");
        String senha = req.getParameter( "senha_cad");

        Cadastro cadastro = new Cadastro(nome,sobrenome,email,senha);


        new CadastroDao().createaccount(cadastro);

        resp.sendRedirect("find-all-Cadastro");
    }
}