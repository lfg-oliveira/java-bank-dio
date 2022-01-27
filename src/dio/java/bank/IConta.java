package dio.java.bank;

public interface IConta {
    //saque de dinheio
    void withdraw(double qty);

    //depositar dinheiro na conta
    void deposit(double qty);

    //transferir para outra conta
    void transfer(double qty, IConta targetAccount);

    //imprimir extrato
    void printExtract();
}
