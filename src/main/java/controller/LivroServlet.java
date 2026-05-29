package controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import repository.LivroRepository;

// Servlet responsável por controlar as requisições de cadastro, listagem e exclusão de livros.
@WebServlet("/livros")
public class LivroServlet extends HttpServlet {
    // Método responsável por listar os livros e tratar a exclusão por ID.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
// Verifica se a ação solicitada é de exclusão.
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
    // Método responsável por receber os dados do formulário e cadastrar um novo livro.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String ano = request.getParameter("ano");
        String isbn = request.getParameter("isbn");
        // Valida se todos os campos obrigatórios foram preenchidos.
        if (titulo == null || titulo.trim().isEmpty()
                || autor == null || autor.trim().isEmpty()
                || ano == null || ano.trim().isEmpty()
                || isbn == null || isbn.trim().isEmpty()) {

            request.setAttribute("erro", "Todos os campos devem ser preenchidos.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
            // Remove espaços e hífens do ISBN antes da validação.
        }isbn = isbn.replace("-", "").replace(" ", "");
            // Valida se o ISBN possui 10 ou 13 dígitos numéricos.
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
