public class Conta{
    public int numeroConta, agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor){
        if (this.status){
            this.saldo += valor;
            System.out.println("- Depósito realizado.");
        } else{
            System.out.println("* Conta inativa *");
        }
    }

    public void sacar(float valor){
        if (this.status){
            if (this.saldo >= valor){
                this.saldo -= valor;
                System.out.println("- Saque realizado. Novo saldo: $" + this.saldo);
            } else {
                System.out.println("* Saldo indisponível *");
            }
        } else{
            System.out.println("* Conta inativa *");
        }
    }

    public void encerrar(){
        if (this.status && this.saldo == 0){
            this.status = false;
            System.out.println("- Conta encerrada.");
        } else{
            System.out.println("* Para encerrar a conta retire o saldo restante *");
        }
    }

    public String toString(){
        return "--------------------------" +
                "\nNúmero: " + this.numeroConta +
                "\nAgência: " + this.agencia +
                "\nCliente: " + this.nomeCliente +
                "\nSaldo atual: " + this.saldo +
                "\nStatus da conta: " + this.status +
                "\n--------------------------";
    }

}