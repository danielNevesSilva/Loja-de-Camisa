package br.com.lojadecamisa.servlet.servlet;

import br.com.lojadecamisa.servlet.dao.CadastroDao;
import br.com.lojadecamisa.servlet.dao.PostDao;
import br.com.lojadecamisa.servlet.model.Cadastro;
import br.com.lojadecamisa.servlet.model.Post;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent;

@WebServlet("/Create-posts")
public class CreatePostServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            Map<String, String> parameters = uploadImage(req);

            String id = parameters.get("id");
            String username = parameters.get("username_post");
            String title = parameters.get("title_post");
            String body = parameters.get("comentario_post");
            String image = parameters.get("image");

            PostDao postDao = new PostDao();
            Post post = new Post(id, username,title, body, image);

            postDao.post(post);
            resp.sendRedirect("Avaliacoes");
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