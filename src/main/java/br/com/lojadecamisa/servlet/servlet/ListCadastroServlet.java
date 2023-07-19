package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.model.Cadastro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


@WebServlet("/Cadastros")
public class ListCadastroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (null == req.getSession().getAttribute("nome_cad")) {

            req.setAttribute("Message", "Usuario invalido");

            req.getRequestDispatcher("login.jsp").forward(req, resp);
        } else {

            List<Cadastro> Cadastros = new CadastroDao().findAllCadastro();

            req.setAttribute("Cadastros", Cadastros);

            req.getRequestDispatcher("Dashboard.jsp").forward(req, resp);
        }
    }
}

