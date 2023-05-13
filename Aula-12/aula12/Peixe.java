package aula12;

public class Peixe extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.print("\nNadando... ");
    }

    @Override
    public void alimentar() {
        System.out.print("Comendo algas... ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao emite som. ");
    }

    public void soltarBolha() {
        System.out.println("Soltando bolha.oO ");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
