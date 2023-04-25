package aula02;

public class Caneta {

    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("");
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao posso rabiscar.\n");
        } else {
            System.out.println("Estou rabiscando!\n");
        }
    }

    void tampar() {
        this.tampada = true;        
    }

    void destampar() {
        this.tampada = false;
    }
}
