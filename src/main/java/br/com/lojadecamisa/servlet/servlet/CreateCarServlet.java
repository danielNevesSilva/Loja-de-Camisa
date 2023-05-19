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

            String id = req.getParameter("id");
            String nome = req.getParameter("nome_cad");
            String sobrenome = req.getParameter("sobrenome_cad");
            String email = req.getParameter("email_cad");
            String senha = req.getParameter("senha_cad");

            CadastroDao cadastroDao = new CadastroDao();
            Cadastro cadastro = new Cadastro(id, nome, sobrenome, email, senha);

        if (id.isBlank()) {

            cadastroDao.createaccount(cadastro);

        } else {

            cadastroDao.updateCadastro(cadastro);
        }

        resp.sendRedirect("find-all-Cadastro");

    }
}
