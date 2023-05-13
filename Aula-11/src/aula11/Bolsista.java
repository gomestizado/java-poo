package aula11;

public class Bolsista extends Aluno {

    private float bolsa;

    public final void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome + ".");
    }

    @Override
    public final void pagarMensalidade() {
        System.out.println(this.nome + " e bolsista! Pagamento feito com desconto.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
