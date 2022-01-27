package com.company;

import dio.java.bank.Bank;
import dio.java.bank.Cliente;
import dio.java.bank.Conta;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Bank jbank = new Bank();
        List<Cliente> clients = new ArrayList<>();

        clients.add(new Cliente("Maria"));
        clients.add(new Cliente("Joao"));

        for (Cliente client: clients) {
            jbank.addCheckingAccount(client);
        }

        assert !jbank.getAccounts().isEmpty();

        Conta[] accs = new Conta[2];
        jbank.getAccounts().toArray(accs);

        accs[0].deposit(100);
        accs[0].transfer(20, accs[1]);
        for(Conta account: jbank.getAccounts()){
            System.out.println(account);
        }

    }
}
