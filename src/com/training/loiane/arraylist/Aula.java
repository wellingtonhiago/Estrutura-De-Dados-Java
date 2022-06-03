package com.training.loiane.arraylist;

import java.util.ArrayList;

public class Aula {
    public static void main(String[] args) {
        ArrayList<String> personagens = new ArrayList<>();

        // add
        System.out.println("----------add--------");
        personagens.add("Naruto");
        personagens.add("Goku");
        personagens.add("Saitama");
        System.out.println(personagens);  // Print

        personagens.add(1, "Seiya");
        System.out.println(personagens);  // Print

        // contains
        System.out.println("----------contains--------");
        System.out.println(personagens.contains("Saitama"));
        System.out.println(personagens.contains("Sasuke"));

        // indexOf
        System.out.println("----------indexOf--------");
        System.out.println(personagens.indexOf("Sasuke"));
        System.out.println(personagens.indexOf("Goku"));

        // get
        System.out.println("----------get--------");
        System.out.println(personagens.get(3));

        // remove
        System.out.println("----------remove--------");
        personagens.remove(0);
        System.out.println(personagens);
    }
}
