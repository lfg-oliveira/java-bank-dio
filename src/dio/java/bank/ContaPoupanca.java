package dio.java.bank;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente owner) {
        super(owner);
    }

    @Override
    public void printExtract() {
        System.out.println("=== Extrato conta poupança ===");
        super.printInfos();
    }
}
