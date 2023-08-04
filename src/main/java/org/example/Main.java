package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.entities.BankAccount;
import org.example.enums.AccountStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.example.entities.BankAccount.toJson;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        BankAccount bankAccount=new BankAccount();
//        bankAccount.accountId="123-ee";
//        bankAccount.currency="cfa";
//        bankAccount.balance=9000;
        // les proprietes etant en private pour respecter le principe de l'encapsulation, on utilise les setters et les getters pour mettre a jour les values et getters pour lire

       // bankAccount.setAccountId("123-ee");
        bankAccount.setCurrency("cfa");
        bankAccount.setBalance(9000);
       // bankAccount.setStatus("CREATED");
        bankAccount.setStatus(AccountStatus.SUSPENDED);
        System.out.println(bankAccount.toString());
        printAccount(bankAccount);
        // constructor with default arguments
        BankAccount bankAccount1=new BankAccount("$",5000);
        printAccount(bankAccount1);


        System.out.println("+++++++++++++++++++++++++++++++++");
        List<BankAccount> bankAccountList=new ArrayList<>();
        bankAccountList.add(bankAccount1);
        bankAccountList.add(bankAccount);
        for (BankAccount acc:bankAccountList) {
            System.out.println(acc.getAccountId());

        }
        System.out.println("============================");
        Map<String,BankAccount> bankAccountMap=new HashMap<>();
        bankAccountMap.put("cc1",new BankAccount());
        bankAccountMap.put("cc2",new BankAccount());
        bankAccountMap.put("cc3",new BankAccount());
        bankAccountMap.put("cc4",new BankAccount());
        for (String key:bankAccountMap.keySet()){
            System.out.println(toJson(bankAccountMap.get(key)));
        }
    }
    public static void printAccount(BankAccount bankAccount){
        System.out.println(bankAccount.getAccountId()+"\t"+bankAccount.getCurrency()+"\t"+bankAccount.getBalance()+"\t"+bankAccount.getStatus());
    }
}