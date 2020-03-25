package com.company;

import java.util.Scanner;

public class Compare {

    int num = 1;

    public void compareNames(String first_name, String second_name) {
        if(!first_name.equals(second_name)) {
            num++;
            retryName(first_name);
        }
        else {
            System.out.println("Felicitari, ai reusit sa ghicesti numele din " + num + " incercari.");
        }
    }

    public void retryName(String first_name) {
        System.out.println("Nu ai reusit sa ghicesti, incearca iar:");
        Scanner second_scanner = new Scanner(System.in);
        String second_name = second_scanner.nextLine();

        compareNames(first_name, second_name);
    }
}
