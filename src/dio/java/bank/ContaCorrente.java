package dio.java.bank;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente owner) {
        super(owner);
    }

    @Override
    public void printExtract() {
        System.out.println("==== Extrato Conta Corrente ===");
        super.printInfos();
    }
}
