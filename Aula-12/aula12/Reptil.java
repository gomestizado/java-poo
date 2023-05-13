package aula12;

public class Reptil extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.print("\nRastejando... ");
    }

    @Override
    public void alimentar() {
        System.out.print("Comendo vegetais... ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil... ");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
