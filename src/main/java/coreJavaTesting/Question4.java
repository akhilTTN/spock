package coreJavaTesting;

import java.util.HashMap;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String with lowerCase,upperCase,digits and special chracters : ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(str.toCharArray().length);
        Question4 question4 = new Question4();
        System.out.println(question4.charPercentCalc(str));
    }

    public HashMap<String, Double> charPercentCalc(String str) {
        char charArray[] = str.toCharArray();
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("lCase", 0.0);
        hm.put("uCase", 0.0);
        hm.put("specialCharacters", 0.0);
        hm.put("digits", 0.0);

        int lCase = 0, uCase = 0, specialCharacters = 0, digits = 0;

        if (charArray.length == 0) {
            return hm;
        }
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] >= 97 && charArray[i] <= 122)
                lCase++;
            else if (charArray[i] >= 65 && charArray[i] <= 90)
                uCase++;
            else if (charArray[i] >= 48 && charArray[i] <= 57)
                digits++;
            else
                specialCharacters++;
        }
        hm.put("lCase", ((double) lCase * 100 / charArray.length));
        hm.put("uCase", ((double) uCase * 100 / charArray.length));
        hm.put("specialCharacters", ((double) specialCharacters * 100 / charArray.length));
        hm.put("digits", ((double) digits * 100 / charArray.length));

        return hm;


    }

}
