package aula14;

public class Aula14 {

    public static void main(String[] args) {

        Video v[] = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 5 de Java");
        v[2] = new Video("Aula 10 de Git");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Bento", 3, "M", "bentinho");
        g[1] = new Gafanhoto("Maria Clara", 7, "F", "maria");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println("");

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

    }

}
