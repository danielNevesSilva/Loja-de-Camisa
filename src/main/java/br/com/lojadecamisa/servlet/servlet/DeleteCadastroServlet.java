package br.com.lojadecamisa.servlet.servlet;


import br.com.lojadecamisa.servlet.dao.CadastroDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delete-cadastro")
public class DeleteCadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String CadastroId = req.getParameter("id");

        new CadastroDao().deleteCadastroById(CadastroId);

        resp.sendRedirect("/find-all-Cadastro");

    }

}
