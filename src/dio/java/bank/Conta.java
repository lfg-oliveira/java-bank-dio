package dio.java.bank;

import org.jetbrains.annotations.NotNull;

public abstract class Conta implements IConta{
    private static final int DEFAULT_AGENCY = 1;
    private static int ID = 1;

    protected int agency = Conta.DEFAULT_AGENCY;
    protected int account;
    protected Cliente owner;
    protected double balance = 0.0;

    public Conta(Cliente owner) {
        this.account = ID++;
        this.owner = owner;
    }

    public void withdraw(double qty) {
        this.checkValidAndSubtract(qty);
    }

    private void checkValidAndSubtract(double qty) {
        if((this.balance - qty)>= 0){
            this.balance -= qty;
            return;
        }
        System.out.println("Saldo insuficiente");

    }

    public void deposit(double qty) {
        this.balance += qty;
    }

    public void transfer(double qty, @NotNull IConta targetAccount) {
        this.checkValidAndSubtract(qty);
        targetAccount.deposit(qty);
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public Cliente getOwner() {
        return owner;
    }

    public void setOwner(Cliente owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agency=" + agency +
                ", account=" + account +
                ", balance=" + balance +
                '}';
    }

    public void printInfos() {
        System.out.printf("Titular: %s%n", this.owner.getName());
		System.out.printf("Agencia: %d%n", this.agency);
		System.out.printf("Numero: %d%n", this.account);
		System.out.printf("Saldo: %.2f%n", this.balance);
    }
}
