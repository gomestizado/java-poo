package aula11;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    //EM PORCENTAGEM
    public final void receberAumento(float v) {
        this.salario += (this.salario * v) / 100;
        System.out.println("Salario de " + this.nome + " aumentado de em " + v + "%!");
        System.out.println("Novo salario: R$" + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
