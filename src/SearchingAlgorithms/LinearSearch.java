package SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] i = {1, 3, 5, 2, 7, 4, 8};

        System.out.println("Element Found at position "+linearSearch.linearSearch(i, 7));
    }

    private int linearSearch(int[] array, int i){
        for (int k = 0; k < array.length; k++){
            if (array[k] == i){
                return (k+1);
            }
        }
        return -1;
    }
}
