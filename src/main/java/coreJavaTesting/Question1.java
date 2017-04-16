package coreJavaTesting;


// Q1. Write a program to replace a substring inside a string with other string ?

public class Question1 {
    public static void main(String[] args) {

        String source;
        String original;
        String replacer;
        source = "To The New";
        original = "World";
        replacer = "New";

        System.out.println(new Question1().stringReplacer(source, original, replacer));
    }

    private boolean stringReplacer(String source, String original, String replacer) {
        String temp = source.replace(original, replacer);
        if (temp.equals(source)) {
            System.out.println("original string isn't present in source string ");
            return false;
        } else {
            System.out.println(temp);
            return true;
        }
    }

}

