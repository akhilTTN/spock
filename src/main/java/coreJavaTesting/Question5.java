package coreJavaTesting;

import java.util.ArrayList;
import java.util.Arrays;


//  Q5.Find common elements between two arrays.


public class Question5 {
    public static void main(String[] args) {
        int firstArray[] = {1,2,3,4,5,3};
        int secondArray[] = {2,4,5};

        System.out.println(new Question5().commonElements(firstArray,secondArray));
    }

    public ArrayList<Integer> commonElements(int firstArray[],int secondArray[]){
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int i=0,j=0;
        while (i < firstArray.length && j < secondArray.length){
            if(firstArray[i] < secondArray[j]){
                i++;
                continue;
            }
            if(firstArray[i] > secondArray[j]){
                j++;
                continue;
            }else{
                al.add(firstArray[i]);
                i++;
                j++;
            }
        }
        return al;
    }
}
