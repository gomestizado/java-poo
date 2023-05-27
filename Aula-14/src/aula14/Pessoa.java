package aula14;

public abstract class Pessoa {

    protected String nome, sexo;
    protected int idade;
    protected float experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }

    protected abstract void ganhaExp();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa {Nome=" + nome + ", Sexo=" + sexo + ", Idade=" + idade + ", Exp=" + experiencia;
    }

}
