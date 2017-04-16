package coreJavaTesting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Q11.Write a single program for following operation using overloading
 *  A) Adding 2 integer number
 *	B) Adding 2 double
 *	C) Multipling 2 float
 *	d) Multipling 2 int
 *	E) concate 2 string
 *	F) Concate 3 String
 */

public class Question11 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static float mul(float a, float b) {
        return a * b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static String add(String s1, String s2) {
        return s1 + s2;
    }

    static String add(String s1, String s2, String s3) {

        return s1 + s2 + s3;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 5));
        System.out.println(add(5.5, 6.7));
        System.out.println(mul(5, 5));
        System.out.println(mul(5.5f, 6.7f));
        System.out.println(add("Noida ", "Sector 127"));
        System.out.println(add("To ", "The ", "New"));
    }

}
