package Sorting;

public class Selection_sort {
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] <= arr[i]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={20, 1, 43, 39, 15};
        int[] res = selectionSort(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(" " + res[i]);
        }
    }
    
}
