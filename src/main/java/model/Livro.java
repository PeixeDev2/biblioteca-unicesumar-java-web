package model;

//Abaixo está a classe livro e seus atributos privados
public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;

    //Abaixo é um construtor vazio
    public Livro(){
    }
    //Abaixo um construtor com todos os atributos
    public Livro(int id, String titulo, String autor, int anopublicacao, String isbn){
        this.id=id;
        this.titulo=titulo;
        this.autor=autor;
        this.anoPublicacao=anopublicacao;
        this.isbn=isbn;
    }
    //Abaixo os setters e getters dos atributos
    public void setTitulo(String titulo){

        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setAnopublicacao(int anopublicacao){
        this.anoPublicacao=anopublicacao;
    }
    public int getAnopublicacao() {
        return anoPublicacao;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    //Abaixo o método para detalhar as informaçoes do livro//
    public void detalharLivro(){
        System.out.println("====Informações do model.Livro====");
        System.out.println("ID: " +id);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Ano de publicação: " +anoPublicacao);
        System.out.println("ISBN: " +isbn);
        System.out.println("------------------------------");
    }
}
