package com.company;

import java.util.Scanner;

public class Compare {

    private int num = 1;

    public int compareNames(char[] first_name, char[] second_name) {
        int temp = 1, leng;
        if (first_name.length != second_name.length)
            temp = 0;
        if(first_name.length > second_name.length)
            leng = second_name.length;
        else
            leng = first_name.length;
        for(int i = 0; i < leng; i++)
            if(first_name[i] != second_name[i])
                temp = 0;

        if(temp == 0) {
            num++;
            retryName(first_name);
        }
        else {
            System.out.println("Felicitari, ai reusit sa ghicesti numele din " + num + " incercari.");
        }
        return 1;
    }

    public void retryName(char[] first_name) {
        System.out.println("Nu ai reusit sa ghicesti, incearca iar:");
        Scanner second_scanner = new Scanner(System.in);
        String second_name = second_scanner.nextLine();

        char[] chars = second_name.toCharArray();
        compareNames(first_name, chars);
    }
}
