package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.dao.ProdutoDao;
import br.com.lojadecamisa.servlet.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
    @WebServlet("/find-all-produtosADM")
    public class ListProdutoAdmServelet  extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            if (null == req.getSession().getAttribute("nome_cad")) {

                req.setAttribute("Message", "Usuario invalido");

                req.getRequestDispatcher("login.jsp").forward(req, resp);

            } else {


                List<Produto> Produtos = new ProdutoDao().selectProdutos();

                req.setAttribute("Produtos", Produtos);

                req.getRequestDispatcher("Dashbordcamisa.jsp").forward(req, resp);

            }
        }
    }