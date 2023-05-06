package aula06;

public class Aula06 {

    public static void main(String[] args) {
        
        ControleRemoto c1 = new ControleRemoto();
        c1.aumentarVolume();
        c1.play();
        c1.abrirMenu();
        c1.fecharMenu();
        
        ControleRemoto c2 = new ControleRemoto();
        c2.ligar();
        c2.aumentarVolume();
        c2.aumentarVolume();
        c2.aumentarVolume();
        c2.abrirMenu();
        c2.diminuirVolume();
        c2.abrirMenu();       
    }
}
