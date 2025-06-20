package org.example;

import service.NameVerify;

public class Main {
    public static void main(String[] args) {
        String[] blocks = {"Arthur", "Maria", "Jua"};
        NameVerify veri = new NameVerify("Jua1", blocks);

        if (veri.nameIsBlocked()){
            System.out.println("Name blocked, bro?");
            System.out.println("Queremos um nome valido! O nome: " + veri.getName()+ ", não é valido");
        }
        else {
            System.out.println("Your name is valid! Welcome "+ veri.getName());
        }
        if (veri.numberVerify()){
            System.out.println("Not passed");
        } else {
            System.out.println("great!");
        }
    }
}