public class Main {
    public static void main(String[] args) {
       Livro l1=new Livro(32,"Cronicas","C.S Lewis",1972,"1234567891011");
       l1.detalharLivro();
       Livro l2=new Livro();
       Livro l3=new Livro();
       l2.setTitulo("GOGO");
       l2.setAutor("Felipe");
       l2.setAnopublicacao(2003);
       l2.setIsbn("1324863875637");
       l2.detalharLivro();

    }
}