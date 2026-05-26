package controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import repository.LivroRepository;

@WebServlet("/livros")
public class LivroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");

        if ("excluir".equals(acao)) {
            String idTexto = request.getParameter("id");

            int id = Integer.parseInt(idTexto);

            LivroRepository.excluirPorId(id);

            response.sendRedirect("livros");
            return;
        }

        request.setAttribute("livros", LivroRepository.listarLivros());

        request.getRequestDispatcher("listar.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String ano = request.getParameter("ano");
        String isbn = request.getParameter("isbn");
        if (titulo == null || titulo.trim().isEmpty()
                || autor == null || autor.trim().isEmpty()
                || ano == null || ano.trim().isEmpty()
                || isbn == null || isbn.trim().isEmpty()) {

            request.setAttribute("erro", "Todos os campos devem ser preenchidos.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }isbn = isbn.replace("-", "").replace(" ", "");

        if (!isbn.matches("\\d{10}|\\d{13}")) {
            request.setAttribute("erro", "ISBN inválido. Informe 10 ou 13 números.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }

        int anoPublicacao = Integer.parseInt(ano);

        LivroRepository.adicionarLivro(titulo, autor, anoPublicacao, isbn);

        response.sendRedirect("livros");
    }
}
