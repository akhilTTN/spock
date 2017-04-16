import java.util.HashSet;
import java.util.Scanner;

/**
] * Q2.Write a method that takes a string and returns the number of unique characters in the string.
 */
public class Question1 {

    private int findUniqueChars(String str){
        char arr[] = str.toCharArray();
        HashSet<Character> hashSet = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question1 q = new Question1();
        System.out.println("Enter the String : ");
        String str = sc.next();
        System.out.println("the total number of unique characters in " + str + " is " + q.findUniqueChars(str));

    }
}
