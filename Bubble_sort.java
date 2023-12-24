import java.util.*;

public class Bubble_sort {
    
	public static void bubbleSort(int[] arr) {
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
