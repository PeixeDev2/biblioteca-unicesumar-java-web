
import java.util.ArrayList;
import java.util.Scanner;

public class LivroRepository {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro l : livros) {
            l.detalharLivro();
        }
    }

    public boolean excluirPorId(int id) {
        return livros.removeIf(livro -> livro.getId() == id);
    }

}

