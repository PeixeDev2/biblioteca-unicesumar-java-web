# Sistema Web Biblioteca Unicesumar

Sistema web acadêmico desenvolvido em Java para auxiliar no cadastro, listagem, validação e exclusão de livros de uma biblioteca universitária.

O projeto foi desenvolvido utilizando Servlets, JSP e JSF, seguindo uma organização baseada no padrão MVC.

## Funcionalidades

- Cadastro de livros com título, autor, ano de publicação e ISBN
- Listagem dos livros cadastrados em tabela
- Exclusão de livros pelo ID
- Validação de campos obrigatórios
- Validação simples de ISBN
- Página "Sobre o Sistema" desenvolvida com JSF
- Interface estilizada com CSS

## Tecnologias utilizadas

- Java
- Servlet
- JSP
- JSF
- Maven
- Apache Tomcat 9
- HTML
- CSS
- Git e GitHub

```txt
src/main/java
├── controller
│   └── LivroServlet.java
├── model
│   └── Livro.java
└── repository
    └── LivroRepository.java

src/main/webapp
├── css
│   └── style.css
├── WEB-INF
│   └── web.xml
├── index.jsp
├── listar.jsp
└── sobre-jsf.xhtml
```

## Estrutura MVC

### Model

A classe `Livro` representa os dados de um livro no sistema, contendo informações como ID, título, autor, ano de publicação e ISBN.

### Repository

A classe `LivroRepository` é responsável por armazenar e manipular os livros em memória, utilizando uma lista Java.

### Controller

A classe `LivroServlet` controla as requisições da aplicação, recebendo dados do formulário, realizando validações, cadastrando livros, listando registros e executando exclusões.

### View

As páginas `index.jsp`, `listar.jsp` e `sobre-jsf.xhtml` compõem a interface do sistema. As páginas JSP são usadas no cadastro e listagem, enquanto a página JSF apresenta informações sobre o sistema e o desenvolvedor.

## Observação sobre armazenamento

Nesta versão, os dados são armazenados em memória utilizando uma lista Java. Portanto, ao reiniciar o servidor Tomcat ou realizar novo deploy da aplicação, os livros cadastrados são perdidos.

## Como executar o projeto

1. Clonar o repositório:

git clone https://github.com/PeixeDev2/biblioteca-unicesumar-java-web.git

2. Abrir o projeto no IntelliJ IDEA.

3. Configurar o Apache Tomcat 9.

4. Configurar o contexto da aplicação como:

/biblioteca

5. Executar o projeto pelo Tomcat.

6. Acessar no navegador:

http://localhost:8080/biblioteca/

## Desenvolvedor

Projeto acadêmico desenvolvido por Daniel Peixe.

- GitHub: https://github.com/PeixeDev2
- LinkedIn: COLOQUE_AQUI_SEU_LINKEDIN