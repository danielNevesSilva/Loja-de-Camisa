package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.dao.ProdutoDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-produto")
public class DeleteProdutoServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String ProdutoId = req.getParameter("id");


        new ProdutoDao().deleteProdutoById(ProdutoId);

        resp.sendRedirect("/find-all-produtosADM");

    }

}
