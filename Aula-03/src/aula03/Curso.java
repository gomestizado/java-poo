package aula03;

public class Curso {

    public String nome, linguagem;
    protected int duracao, aula;
    private boolean emAula;

     protected void comecarAula() {
        if (this.emAula == true) {
            System.out.println("ERRO! Aula ja esta em andamento.\n");
        } else {
            System.out.println("Aula iniciada com sucesso!\n");
            this.emAula = true;
        }
    }

    protected void terminarAula() {
        if (this.emAula == false) {
            System.out.println("ERRO! Aula nao foi iniciada.\n");
        } else {
            System.out.println("Aula encerrada!\n");
            this.emAula = false;
        }
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Linguagem: " + this.linguagem);
        System.out.println("Aula: " + this.aula);
        System.out.println("Duracao: " + this.duracao + "h");
        System.out.println("Em aula: " + this.emAula);
        System.out.println("");
    }

}
