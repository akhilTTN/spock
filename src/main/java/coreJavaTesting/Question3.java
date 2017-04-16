package coreJavaTesting;

import java.util.Scanner;


//  Q3. Write a program to find the number of occurrences of a character in a string without using loop?

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Enter a character whose occurence you want to find : ");
        char a = sc.next().charAt(0);
        int count = counter(a, str);
        System.out.println("the character " + a + " has occurence of " + count + " in " + str);
    }

    static int counter(char a, String str) {
        if (str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == a) {
            int temp = counter(a, str.substring(1));
            return temp + 1;
        } else {
            return counter(a, str.substring(1));
        }
    }
}
