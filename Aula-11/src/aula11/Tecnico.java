package aula11;

public class Tecnico extends Aluno {

    private String registroProfissional;

    public final void praticar() {
        System.out.println("Praticando...");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
