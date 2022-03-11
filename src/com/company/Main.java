package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        User user = new User("Aichurok", "Turgunbaeva");
        Map<User,BankAccount> users = new HashMap<>(Map.of(new User("Chinara","Mamatalieva"),
                new BankAccount(6100200),
                new User("Aichurok","Turgunbaeva"), new BankAccount(5100200),
                new User("Barchinay","Iakubova"), new BankAccount(1000000),
                new User("Kunzaada","Bekzhanova"), new BankAccount(932560),
                new User("Dilbara","Asanalieva"), new BankAccount(5100200),
                new User("Dinara","Rahatbek kyzy"), new BankAccount(3564527),
                new User("Nargiza","Sultanmuratova"), new BankAccount(542585),
                new User("Klara","Azimova"), new BankAccount(5245854),
                new User("Nurzhan","Abdyraeva"), new BankAccount(5100200),
                new User("Jamal","apa"), new BankAccount(4525632)));

                users.put(new User("Ayzirek","Turgunbaeva"), new BankAccount(524526));

                transaction(users, user, 45000);
    }
    public static void transaction(Map<User, BankAccount> map, User user, int money) {
        BankAccount bankAccount = map.get(user);
        System.out.println("Your expense: $ "+ money);
        bankAccount.takeMoney(money);
        System.out.println("Your balance: $ "+ bankAccount.getBalance());



    }
}
