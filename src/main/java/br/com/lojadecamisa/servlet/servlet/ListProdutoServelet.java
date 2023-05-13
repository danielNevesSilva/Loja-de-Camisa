package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.model.Cadastro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-produtos")
public class ListProdutoServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Cadastro> produtos = new CadastroDao().selectProdutos();

        req.setAttribute("produtos", produtos);

        req.getRequestDispatcher("promocao.jsp").forward(req,resp);

    }
}
