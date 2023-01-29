package com.oxyac.intro;

import com.oxyac.intro.lucrare.Lucrare;
import com.oxyac.intro.lucrare.Lucrare1;

import java.util.HashMap;
import java.util.Scanner;

public class Application {
    static HashMap<Integer, Lucrare> works;
    static private Scanner scanner;
    public static void run() {
        loadWorks();
        System.out.println("Intrati numarul lucrarii: ");
        int input = acceptInput();
        while(works.get(input) == null) {
            System.out.println("Lucrare nu exista, tapati alta: ");
            input = acceptInput();
        }

        Lucrare lucrare = works.get(input);
        long startTime = System.nanoTime();
        lucrare.run();
        long stopTime = System.nanoTime();
        System.out.printf("Execution time: %s seconds", (double)(stopTime - startTime) / 1_000_000_000.0);
    }

    private static void loadWorks() {
        works = new HashMap<>();
        works.put(1, new Lucrare1());
    }

    private static Integer acceptInput() {
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        String userName = scanner.nextLine();
        try{
            return Integer.parseInt(userName);
        } catch (Throwable e) {
            return 0;
        }
    }
}
