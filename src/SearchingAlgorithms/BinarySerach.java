package SearchingAlgorithms;

import java.util.Arrays;

public class BinarySerach {
    public static void main(String[] args) {
        BinarySerach binarySerach = new BinarySerach();
        int[] i = {1, 3, 5, 2, 7, 4, 8};
        binarySerach.binarySearch(i, 3);
    }

    private int binarySearch(int[] array, int i) {
        Arrays.sort(array);

        int startPosition = 0;
        int midPosition = 0;
        int midElement = 0;
        int [] array2 = new int[midPosition];

        if (array.length>0){
            if (array.length == 1){
                if (i == array[0]){
                    System.out.println("found");
                    return 1;
                }else{
                    System.out.println("Not Found");
                    return -1;
                }
            }
            else{
                midPosition = array.length/2;
                midElement = array[midPosition];
                array2 = new int[midPosition];
            }
        }

        if (i == midElement){
            System.out.println("found");
            return 1;
        }else if (i > midElement){
            for (int k = midPosition+1; k < array.length; k++){
                array2[startPosition] = array[k];
                startPosition++;
            }
            System.out.println(Arrays.toString(array2));
            binarySearch(array2, i);
        }else if(i < midElement) {
            for (int k = 0; k < midPosition; k++) {
                array2[startPosition] = array[k];
                startPosition++;
            }
            System.out.println(Arrays.toString(array2));
            binarySearch(array2, i);
        }
        return -1;
    }
}
