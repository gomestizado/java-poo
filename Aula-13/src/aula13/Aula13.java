package aula13;

public class Aula13 {

    public static void main(String[] args) {
       
        Cachorro d = new Cachorro();
        
        //FRASE
        d.reagir("ola");
        System.out.println("");
        d.reagir("vai apanhar");
        System.out.println("\n");        
        
        //HORA
        d.reagir(11, 45);
        System.out.println("");
        d.reagir(21, 00);
        System.out.println("");
        d.reagir(16, 00);
        System.out.println("\n");
        
        //DONO
        d.reagir(true);
        System.out.println("");
        d.reagir(false);
        System.out.println("\n");        
        
        //IDADE E PESO
        d.reagir(2, 12.5f);
        System.out.println("");
        d.reagir(17, 4.5f);
        System.out.println("\n");
        
    }

}
