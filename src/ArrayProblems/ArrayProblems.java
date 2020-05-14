package ArrayProblems;

import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {
        ArrayProblems arrayProblems = new ArrayProblems();
        arrayProblems.findMinimum();
    }

    private void findMinimum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length of the Array : ");
        int len = input.nextInt();
        int arr[] = new int[len];
        for (int h = 0; h < arr.length; h++) {
            System.out.print("Enter " + h + " number : ");
            arr[h] = input.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
