//Abaixo é o comando para importar a biblioteca para trabalhar com Arraylist
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      LivroRepository repository = new LivroRepository();

      repository.adicionarLivro(new Livro(1, "GIGA", "Gisele", 1972, "3878378937"));
      repository.adicionarLivro(new Livro(2, "GA", "Geilse", 1979, "3878564987987"));
      repository.adicionarLivro(new Livro(3, "Gh", "Gislsa", 1999, "3454212987"));

      repository.listarLivros();

      System.out.println("Digite o ID do livro que deseja excluir:");
      int idDelete = scanner.nextInt();

      boolean removido = repository.excluirPorId(idDelete);

      if (removido) {
         System.out.println("Livro removido!");
      } else {
         System.out.println("ID de livro não encontrado!");
      }
      repository.listarLivros();

      scanner.close();
   }
}