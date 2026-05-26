package repository;
import model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

    private static List<Livro> livros = new ArrayList<>();
    private static int proximoId = 1;

    public static void adicionarLivro(String titulo, String autor, int anoPublicacao, String isbn) {
        Livro livro = new Livro(proximoId, titulo, autor, anoPublicacao, isbn);
        livros.add(livro);
        proximoId++;
    }

    public static List<Livro> listarLivros() {
        return livros;
    }

    public static boolean excluirPorId(int id) {
        return livros.removeIf(livro -> livro.getId() == id);
    }
}
