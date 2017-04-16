package coreJavaTesting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Q9. Write a program to read text file & print the content of file using String Builder.
 */
public class Question9 {

    public static StringBuilder printer() throws IOException {
        String fileName = System.getProperty("user.dir") + "/src/ttnd.txt";
        BufferedReader br = null;
        FileReader fr;
        StringBuilder strBuilder = new StringBuilder();
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String str;


            while ((str = br.readLine()) != null) {
                if (strBuilder.length() > 0)
                    strBuilder.append("\n");
                strBuilder.append(str);
            }
            System.out.println(strBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return strBuilder;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Question9.printer());
    }
}

