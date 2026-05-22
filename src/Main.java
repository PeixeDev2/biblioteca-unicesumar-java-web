//Abaixo é o comando para importar a biblioteca para trabalhar com Arraylist
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

   ArrayList<Livro> livros=new ArrayList<>();
   Scanner scanner = new Scanner(System.in);
   livros.add(new Livro(43,"GIGA","Gisele",1972,"3878378937"));
   livros.add(new Livro(3,"GA","Geilse",1979,"3878564987987"));
   livros.add(new Livro(5,"Gh","Gislsa",1999,"3454212987"));
   for (Livro l: livros){
      l.detalharLivro();
   }
       System.out.println("Digite o ID do livro que deseja deletar:");
       int iddelete = scanner.nextInt();

       boolean removido = livros.removeIf(l -> l.getId() == iddelete);

       if (removido) {
          System.out.println("Livro removido!");
       } else {
          System.out.println("ID de livro não encontrado!");
       }
       for (Livro l: livros){
          l.detalharLivro();
       }

    }
}