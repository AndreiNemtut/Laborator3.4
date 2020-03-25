package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Compare comp = new Compare();

        System.out.println("Introduceti numele de la tastatura:");
        Scanner first_scanner = new Scanner(System.in);
        String c = first_scanner.nextLine();

        System.out.println("Incercati sa ghiciti numele:");
        Scanner second_scanner = new Scanner(System.in);
        String second_name = second_scanner.nextLine();

        comp.compareNames(c, second_name);
    }
}
