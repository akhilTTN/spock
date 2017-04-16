package coreJavaTesting;

import java.util.Scanner;


public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(new Question8().subStrRemover(str));
    }

    public StringBuffer subStrRemover(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        if(str.length() == 0){
            return stringBuffer;
        }
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        //4 is inclusive and 9 is exclusive
        // System.out.println(stringBuffer.delete(4,9));
        if(stringBuffer.length() > 9){
            stringBuffer.delete(4, 9);
            return stringBuffer;
        }
        System.out.println(stringBuffer + " not of enough size so deletion not possible");
        return stringBuffer;
    }
}

