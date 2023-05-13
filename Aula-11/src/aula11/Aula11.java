package aula11;

public class Aula11 {

    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(0001);
        b1.setCurso("SQL");
        b1.setIdade(22);
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Maria");
        t1.setMatricula(0002);
        t1.setCurso("POO");
        t1.setIdade(45);
        t1.setSexo("F");
        t1.setRegistroProfissional("");
        t1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Gustavo");
        p1.setIdade(38);
        p1.setSexo("M");
        p1.setEspecialidade("Programacao");
        p1.setSalario(2000f);
        p1.receberAumento(10f);

    }

}
