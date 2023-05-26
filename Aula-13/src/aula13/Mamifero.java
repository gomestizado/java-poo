package aula13;

public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void locomover() {
        System.out.print("\nAndando... ");
    }

    @Override
    public void alimentar() {
        System.out.print("Mamando... ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero... ");
    }

}
