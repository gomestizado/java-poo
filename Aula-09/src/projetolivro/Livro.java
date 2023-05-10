package projetolivro;

public class Livro implements Publicacao {

    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + "\n Titulo=" + titulo + " | Autor=" + autor + "\n totPaginas=" + totPaginas + " | pagAtual=" + pagAtual + " | aberto=" + aberto
                + "\n leitor=" + leitor.getNome() + " | idade=" + leitor.getIdade() + " | sexo=" + leitor.getSexo() + '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (aberto) {
            if (p > this.totPaginas) {
                this.pagAtual = 0;
                System.out.println("Valor excede o limite de paginas. Voltando para o inicio!");
            } else {
                this.pagAtual = p;
            }
        } else {
            System.out.println("O livro esta fechado!");
        }
    }

    @Override
    public void avancarPag() {
        if (aberto) {
            this.pagAtual++;
        } else {
            System.out.println("O livro esta fechado!");
        }
    }

    @Override
    public void voltarPag() {
        if (aberto) {
            this.pagAtual--;
        } else {
            System.out.println("O livro esta fechado!");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPaginas;
    }

    public void setTotPag(int totPag) {
        this.totPaginas = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
