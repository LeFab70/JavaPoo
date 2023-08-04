package org.example.entities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.enums.AccountStatus;

import java.util.UUID;

public class BankAccount {
     private String accountId;
    private double balance;
   private String currency;

   private AccountStatus status;
    //protected=>accessible par les class en heritage et les class appartenant au meme package
    //private utilisable uniquement dans la class ici on respect le principe de l'encapsulation
    //ne pas les mettre en public

    //constructor with no args
 public BankAccount(){
     this.status=AccountStatus.ACTIVATED;
     this.accountId= UUID.randomUUID().toString(); //generate  ID
 }

 // constructor with args
public BankAccount(String currency,double initialBalance){
     this();  //polymorphism surcharge==override de la methode
     this.currency=currency;
     this.balance=initialBalance;
}
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status= status;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }
    public static String toJson(Object object) throws JsonProcessingException {
       ObjectMapper objectMapper=new ObjectMapper();

        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
    }
}
