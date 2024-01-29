import contas.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1350.32);
        cc.extrato();
    }
}