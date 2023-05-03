package aula03;

public class Caneta {

    public String modelo, cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("");
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao posso rabiscar.\n");
        } else {
            System.out.println("Estou rabiscando!\n");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
