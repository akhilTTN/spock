package coreJavaTesting;



//  Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    String[] msort(String[] arr, int start, int end) {
        if (start < end) {
            int half = (start + end) / 2;
            msort(arr, start, half);
            msort(arr, half + 1, end);
            merge(arr, start, half, end);
        }
        return arr;
    }

    String[] merge(String arr[], int start, int half, int end) {

        int size_of_array1 = half - start + 1;
        int size_of_array2 = end - half;
        String left[] = new String[size_of_array1];
        String right[] = new String[size_of_array2];
        for (int i = 0; i < size_of_array1; i++) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < size_of_array2; i++) {
            right[i] = arr[half + 1 + i];
        }
        int i = 0, j = 0, k = start;
        while (i < size_of_array1 && j < size_of_array2) {
            if (left[i].compareTo(right[j]) < 0) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < size_of_array1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < size_of_array2) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }

    void printArray(String[] str_arr) {
        for (int i = 0; i < str_arr.length; i++) {
            System.out.print(str_arr[i] + "\t");
        }
        System.out.println();
    }

    int getCount(String[] arr) {
        String fisrts = arr[0];
        int ctr = 1;
        int i;
        for (i = 1; i < arr.length; i++) {
            if (fisrts.equals(arr[i])) {
                ctr++;
            } else {
                fisrts = arr[i];
                System.out.println(arr[i - 1] + " has occured " + ctr + " times");
                ctr = 1;
            }
        }
        System.out.println(arr[i - 1] + " has occured " + ctr + " times");
        return ctr;
    }

    String[] getStringArray() {
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        string = sc.nextLine();
        return string.split(" ");
    }

    public static void main(String[] args) {
        Question2 ob1 = new Question2();
        String[] str_arr = ob1.getStringArray();
        System.out.println(Arrays.toString(ob1.msort(str_arr, 0, str_arr.length - 1)));
//        System.out.println(Arrays.toString(ob1.merge(str_arr,0,2,5)));
//        ob1.printArray(str_arr);
        ob1.getCount(str_arr);

    }
}
