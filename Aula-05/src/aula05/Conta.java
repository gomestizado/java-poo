package aula05;

public class Conta {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.status = false;
        this.saldo = 0f;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.tipo = tipo;
        this.status = true;
        if (tipo == "cc") {
            saldo = 50f;
            System.out.println("Conta de " + this.dono + " aberta com SUCESSO!");
        } else if (tipo == "cp") {
            this.saldo = 150f;
            System.out.println("Conta de " + this.dono + " aberta com SUCESSO!");
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro!");
            System.out.println("Nao e possivel encerrar a conta.");
        } else if (saldo < 0) {
            System.out.println("Conta em debito!");
            System.out.println("Nao e possivel encerrar a conta.");
        } else {
            this.status = false;
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.status == true) {
            this.saldo = this.saldo + valor;
            System.out.println("Deposito realizado na conta de " + this.dono + " com SUCESSO!");
        } else {
            System.out.println("ERRO! Não e possível depositar em uma conta inativa.");
        }
    }

    public void sacar(float valor) {
        if (this.status == true) {
            if (this.saldo >= valor) {
                this.saldo = this.saldo - valor;
                System.out.println("Saque realizado na conta de " + this.dono + " com SUCESSO!");
            } else {
                System.out.println("Saldo de " + this.dono + " e insuficiente para o saque!");
            }
        } else {
            System.out.println("ERRO! Não e possível sacar em uma conta inativa.");
        }
    }

    public void pagarMensalidade() {
        int v = 0;
        if (this.tipo == "cc") {
            v = 12;
        } else if (this.tipo == "cp") {
            v = 20;
        }

        if (this.status == true) {
            if (this.saldo >= v) {
                this.saldo = this.saldo - v;
                System.out.println("Mensalidade paga com SUCESSO!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("ERRO! Não e possível pagar a mensalidade em uma conta inativa.");
        }
    }

    public void imprimir() {
        System.out.println("-------------------");
        System.out.println("Conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
        System.out.println("");
    }
}
