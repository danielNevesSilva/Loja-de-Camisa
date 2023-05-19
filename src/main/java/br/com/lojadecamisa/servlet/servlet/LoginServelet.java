package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.model.Cadastro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpClient;

@WebServlet("/login")
public class LoginServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome_cad");
        String senha = req.getParameter("senha_cad");

        Cadastro user = new Cadastro(nome, senha);

        boolean isValidUser = new CadastroDao().Verificredentials(user);

        if (isValidUser) {

            req.getSession().setAttribute("nome_cad", nome);

            resp.sendRedirect("find-all-Cadastro");

        } else {

            req.setAttribute("message", "Invalid credentials!");

            req.getRequestDispatcher("login.jsp").forward(req, resp);

        }

    }

}
