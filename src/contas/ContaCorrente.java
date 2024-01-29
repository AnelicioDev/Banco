package contas;

public class ContaCorrente extends Conta{
    public void contaCorrente(){
        super.argencia = ARGENCIA_PADRAO;
        super.conta = SEQUENCIAL++;
    }

}
