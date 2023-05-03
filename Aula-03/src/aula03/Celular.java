package aula03;

public class Celular {
    
    public String marca, modelo, cor;
    protected int armazenamento;
    private boolean cheio;
    
    protected void instalarApp () {
        if (this.cheio == false) {
            System.out.println("App INSTALADO com sucesso!\n");
            this.cheio = true;
        } else {
            System.out.println("ERRO! Não ha espaco suficiente.\n");
        }        
    }
    
    protected void desinstalarApp () {
        System.out.println("App DESINSTALADO com sucesso!\n");
        this.cheio = false;
    }
    
    public void imprimir () {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.modelo);
        System.out.println("Armazenamento: " + this.armazenamento);
        System.out.println("Esta cheio: " + this.cheio);
        System.out.println("");
    }
    
}
