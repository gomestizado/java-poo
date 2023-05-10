package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Design Thinking", "Tim Brown", 272, p[0]);
        l[1] = new Livro("A Coragem de ser imperfeito", "Bene Brown", 208  , p[1]);
        l[2] = new Livro("O Poder dos quietos", "Susan Cain", 336, p[0]);
        

        //l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        l[0].voltarPag();        
        System.out.println(l[0].detalhes());
        
        l[1].abrir();
        l[1].avancarPag();
        l[1].avancarPag();
        System.out.println("\n" + l[1].detalhes());

        l[2].abrir();
        l[2].folhear(150);        
        System.out.println("\n" + l[2].detalhes());
    }
}
