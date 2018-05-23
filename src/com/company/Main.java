package com.company;

public class Main {

    public static void main(String[] args) {

        StringBuilder string = new StringBuilder();

        for (int i = 100; i > 0 ; i--) {
            if(i % 3 == 0 && i % 5 == 0) {
                string.append("test, ");
            }

            if(i % 3 == 0 && i % 5 != 0) {
                string.append(i + ", ");
            }
        }

        System.out.print(string.substring(0, string.length() - 2) + ".");
    }
}