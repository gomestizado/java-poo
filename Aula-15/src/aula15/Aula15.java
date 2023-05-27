package aula15;

public class Aula15 {

    public static void main(String[] args) {

        Video v[] = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 5 de Java");
        v[2] = new Video("Aula 10 de Git");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Bento", 3, "M", "bentinho");
        g[1] = new Gafanhoto("Maria Clara", 7, "F", "maria");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]); //Bento assiste Java
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[2]); //Bento assiste Git
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());

        vis[2] = new Visualizacao(g[1], v[0]); //Bento assiste POO
        vis[2].avaliar(10);
        System.out.println(vis[2].toString());
    }

}
