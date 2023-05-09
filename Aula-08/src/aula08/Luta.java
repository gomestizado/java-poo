package aula08;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("\n### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("\n### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);
            System.out.println("\n=== RESULTADO ===");
            switch (vencedor) {
                case 0: //EMPATE
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //DESAFIADO
                    System.out.println(this.desafiado.getNome() + " ganhou a luta!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // DESAFIANTE
                    System.out.println(this.desafiante.getNome() + " ganhou a luta!!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=================");
        } else {
            System.out.println("\nERRO!!! Luta nao pode acontecer.");
        }
    }

}
