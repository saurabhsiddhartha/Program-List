 import java.util.Arrays;
public class Quick_Sort {
    public static int partition(int arr[], int s, int e) {
        int pivot = arr[s];
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int rightPlaceofPivot = s + count;
        int temp = arr[rightPlaceofPivot];
        arr[rightPlaceofPivot] = pivot;
        arr[s] = temp;
    
        int j = e;
        int i = s;
        while (i < rightPlaceofPivot && j > rightPlaceofPivot) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
    
            if (i < rightPlaceofPivot && j > rightPlaceofPivot) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        return rightPlaceofPivot;
    }
    
public static void quicksort(int arr[] , int s , int e){
    if (s >= e) {
        return;
    }
    int PI = partition(arr, s, e);
    quicksort(arr, s, PI - 1);
    quicksort(arr, PI + 1, e);
}
     public static void main(String args[]){ 
         int arr[] = {4,3,6,7,5,2,9,8};
         quicksort(arr, 0 , arr.length-1);
         System.out.println(Arrays.toString(arr));

     }
}
