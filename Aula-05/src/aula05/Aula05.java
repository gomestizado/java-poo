package aula05;
public class Aula05 {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Matheus");
        p1.imprimir();
        p1.abrirConta("cc");
        p1.imprimir();
        
        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Maria Clara");
        p2.imprimir();
        p2.abrirConta("cp");
        p2.imprimir();
        
        p1.depositar(250);
        p2.depositar(350);
        p1.imprimir();
        p2.imprimir();
        
        p2.sacar(100);
        p2.imprimir();
        
        p1.sacar(500);
        p1.fecharConta();
        
        p1.sacar(300);
        p1.fecharConta();
        p1.imprimir();
    }
    
}
