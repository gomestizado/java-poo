package aula13;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.print("Latindo... ");
    }

    @Override
    public void rosnar() {
        System.out.print("Rosnando... ");
    }

    public void abanarRabo() {
        System.out.print("Abanando o rabo... ");
    }

    public void reagir(String frase) {
        if (frase.equals("toma comida") || frase.equals("ola")) {
            this.emitirSom();
            this.abanarRabo();
        } else {
            this.rosnar();
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            this.abanarRabo();
        } else if (hora >= 18) {
            System.out.print("Ignorar... ");
        } else {
            this.emitirSom();
            this.abanarRabo();
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            this.abanarRabo();
        } else {
            this.rosnar();
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                this.abanarRabo();
            } else {
                this.emitirSom();
            }
        } else {
            if (peso < 10) {
                this.rosnar();
            } else {
                System.out.println("Ignorar... ");
            }
        }
    }

}
