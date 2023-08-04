package org.example.entities;

public class CurrentAccount extends BankAccount{
    private double overDraft;

    public CurrentAccount(double overDraft) {
        this.overDraft = overDraft;
    }

    public CurrentAccount(String currency, double initialBalance, double overDraft) {
        super(currency, initialBalance);
        this.overDraft = overDraft;
    }
}
