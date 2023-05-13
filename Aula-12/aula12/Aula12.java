package aula12;

public class Aula12 {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro d = new Cachorro();

        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();

        Goldfish g = new Goldfish();

        Arara b = new Arara();

        c.locomover();
        c.alimentar();
        c.emitirSom();
        d.locomover();
        d.alimentar();
        d.emitirSom();

        s.locomover();
        s.alimentar();
        s.emitirSom();
        t.locomover();
        t.alimentar();
        t.emitirSom();

        g.locomover();
        g.alimentar();
        g.emitirSom();

        b.locomover();
        b.alimentar();
        b.emitirSom();
    }

}
