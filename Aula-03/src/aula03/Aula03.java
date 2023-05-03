package aula03;

public class Aula03 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; Atributo privado
        c1.carga = 80;
        //c1.tampada = false; Atributo privado

        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        
        //EXERCICIOS        
        Curso crs1 = new Curso();
        crs1.nome = "POO";
        crs1.duracao = 40;
        crs1.aula = 02;
        crs1.linguagem = "Java";
        //crs1.emAula = false;
        
        crs1.imprimir();
        crs1.comecarAula();
        crs1.imprimir();

        
        Celular cel1 = new Celular();
        cel1.marca = "Apple";
        cel1.modelo = "Iphone11";
        cel1.cor = "Preto";
        cel1.armazenamento = 64;
        //cel1.cheio = false;
        
        cel1.imprimir();
        cel1.instalarApp();
        cel1.imprimir();
    }

}
