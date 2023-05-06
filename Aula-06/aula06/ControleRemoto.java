package aula06;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("\n----- MENU TV -----");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("#");
            }
            System.out.println("");
        } else {
            System.out.println("A TV esta desligada.");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("Fechando Menu...");
        } else {
            System.out.println("O menu ja esta fechado");
        }
    }

    @Override
    public void aumentarVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void diminuirVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void mute() {
        if (this.getLigado() && this.getVolume() > 0) {
            setVolume(0);
        } else {
            System.out.println("");
        }
    }

    @Override
    public void desmute() {
        if (this.getLigado() && this.getVolume() == 0) {
            setVolume(50);
        } else {
            System.out.println("");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Nao consigo reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Nao consigo pausar");
        }
    }

}
