package aula12;

public class Cobra extends Reptil {

    @Override
    public void alimentar() {
        System.out.print("Comendo outros animais... ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sibilando... ");
    }

}
