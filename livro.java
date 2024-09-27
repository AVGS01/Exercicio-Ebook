import java.util.ArrayList;

class Livro {
    String titulo;
    String autor;
    double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
    }
}

class Ebook extends Livro {
    double tamanhoArquivo;

    public Ebook(String titulo, String autor, double preco, double tamanhoArquivo) {
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + " MB");
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 39.90));
        livros.add(new Ebook("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 29.90, 1.5));
        livros.add(new Livro("1984", "George Orwell", 25.00));
        livros.add(new Ebook("A Revolução dos Bichos", "George Orwell", 15.00, 0.8));

        for (Livro livro : livros) {
            System.out.println("\nDetalhes do Livro:");
            livro.exibirDetalhes();
        }
    }
}
