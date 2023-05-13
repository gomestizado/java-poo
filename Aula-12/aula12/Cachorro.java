package aula12;

public class Cachorro extends Mamifero {

    @Override
    public void locomover() {
        System.out.print("Correndo... ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo... ");
    }    
    
    public void enterrarOsso() {
        System.out.println("Enterrando osso... ");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo... ");
    }
}
