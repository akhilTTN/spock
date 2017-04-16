package coreJavaTesting;

public class Question6 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};


        System.out.println(new Question6().findUniqueNumber(arr));
    }

    public int findUniqueNumber(int arr[]){
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }
}