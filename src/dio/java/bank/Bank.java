package dio.java.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Conta> accounts = new ArrayList<>();

    public String getName() {
        return "JavaBank";
    }

    public List<Conta> getAccounts() {
        return accounts;
    }

    public void addCheckingAccount(Cliente client) {
        this.accounts.add(new ContaCorrente(client));
    }

    public void addSavingsAccount(Cliente client){
        this.accounts.add(new ContaPoupanca(client));
    }
}
