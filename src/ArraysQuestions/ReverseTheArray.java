package ArraysQuestions;

import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 1};
        System.out.println(Arrays.toString(arr));
        reverseTheArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void reverseTheArray(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

}
