package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.dao.PostDao;
import br.com.lojadecamisa.servlet.model.Cadastro;
import br.com.lojadecamisa.servlet.model.Post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Avaliacoes")
public class ListPostServelet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                List<Post> Posts = new PostDao().selectPosts();

                req.setAttribute("Posts", Posts);

                req.getRequestDispatcher("avaliacoes.jsp").forward(req, resp);
            }
}

