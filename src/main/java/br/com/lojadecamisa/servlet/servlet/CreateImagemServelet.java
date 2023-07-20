package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.dao.ProdutoDao;
import br.com.lojadecamisa.servlet.model.Cadastro;


import br.com.lojadecamisa.servlet.model.Produto;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent;


@WebServlet("/create-image")
public class CreateImagemServelet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String> parameters = uploadImage(req);

        String image = parameters.get("image");
        String id = parameters.get("id");
        String ano_camisa = parameters.get("ano_camisa");
        String nome_camisa = parameters.get("nome_camisa");
        String tamanho = parameters.get("tamanho");
        String valor_produto = parameters.get("valor_produto");
        String quantidade = parameters.get("quantidade");

        ProdutoDao produtoDao = new ProdutoDao();
        Produto produto = new Produto(id, ano_camisa, nome_camisa,tamanho ,valor_produto, quantidade, image );

       if (id.isBlank()) {

            produtoDao.createImagem(produto);

        } else {
          produtoDao.updateProduto(produto);
        }

        resp.sendRedirect("Lista-de-camisas");

    }

    private Map<String, String> uploadImage(HttpServletRequest httpServletRequest) {

        Map<String, String> requestParameters = new HashMap<>();

        if (isMultipartContent(httpServletRequest)) {

            try {

                DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();

                List<FileItem> fileItems = new ServletFileUpload(diskFileItemFactory).parseRequest(httpServletRequest);

                for (FileItem fileItem : fileItems) {

                    checkFieldType(fileItem, requestParameters);

                }

            } catch (Exception ex) {

                requestParameters.put("image", "img/default-produto.jpg");
            }
        }
        return requestParameters;
    }
    private void checkFieldType(FileItem item, Map requestParameters) throws Exception {

        if (item.isFormField()) {

            requestParameters.put(item.getFieldName(), item.getString());

        } else {

            String fileName = processUploadedFile(item);
            requestParameters.put("image", "img/".concat(fileName));
        }
    }
    private String processUploadedFile(FileItem fileItem) throws Exception {
        Long currentTime = new Date().getTime();
        String fileName = currentTime.toString().concat("-").concat(fileItem.getName().replace(" ", ""));
        String filePath = this.getServletContext().getRealPath("img").concat(File.separator).concat(fileName);
        fileItem.write(new File(filePath));
        return fileName;
    }


}
