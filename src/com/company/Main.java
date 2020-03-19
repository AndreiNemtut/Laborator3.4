package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Compare comp = new Compare();

        System.out.println("Introduceti numele de la tastatura:");
        Scanner first_scanner = new Scanner(System.in);
        String first_name = first_scanner.nextLine();
        char c[] = first_name.toCharArray();

        System.out.println("Incercati sa ghiciti numele:");
        Scanner second_scanner = new Scanner(System.in);
        String second_name = second_scanner.nextLine();
        char[] s_name = second_name.toCharArray();

        comp.compareNames(c, s_name);
    }
}
