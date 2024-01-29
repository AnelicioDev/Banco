package contas;

public abstract class Conta {
    protected static int ARGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 001;
    protected int conta;
    protected int argencia;
    private double saldo;

    public void depositar(double depositar){
        saldo += depositar;
    }
    public void sacar(double sacar){
        saldo -= sacar;
    }

    public int getConta() {
        return conta;
    }

    public int getArgencia() {
        return argencia;
    }

    public double getSaldo() {
        return saldo;
    }
    public void extrato(){
        System.out.println("numéro da argência: "+argencia);
        System.out.println("numéro da conta "+conta);
        System.out.println("seu saldo: "+saldo);
    }
}
