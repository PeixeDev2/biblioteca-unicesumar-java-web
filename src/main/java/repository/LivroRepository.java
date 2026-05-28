package repository;
import model.Livro;
import java.util.ArrayList;
import java.util.List;
// Classe responsável por armazenar e manipular os livros em memória.
public class LivroRepository {
    // Lista estática utilizada para armazenar os livros durante a execução da aplicação.
    private static List<Livro> livros = new ArrayList<>();
    private static int proximoId = 1;
    // Adiciona um novo livro à lista.
    public static void adicionarLivro(String titulo, String autor, int anoPublicacao, String isbn) {
        Livro livro = new Livro(proximoId, titulo, autor, anoPublicacao, isbn);
        livros.add(livro);
        proximoId++;
    }
    // Retorna todos os livros cadastrados.
    public static List<Livro> listarLivros() {
        return livros;
    }
    // Remove um livro da lista com base no ID informado.
    public static boolean excluirPorId(int id) {
        return livros.removeIf(livro -> livro.getId() == id);
    }
}
