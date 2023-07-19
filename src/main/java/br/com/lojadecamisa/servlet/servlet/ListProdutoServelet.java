package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.dao.ProdutoDao;
import br.com.lojadecamisa.servlet.model.Cadastro;
import br.com.lojadecamisa.servlet.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Oferta-de-camisas")
public class ListProdutoServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<Produto> Produtos = new ProdutoDao().selectProdutos();

        req.setAttribute("Produtos", Produtos);

        req.getRequestDispatcher("promocao.jsp").forward(req, resp);

    }
}
