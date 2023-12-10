import java.util.Arrays;

public class merge_sort { 

        public static void mergeSort(int[] array) {
            if (array.length <= 1) {
                return;  
            }
    
            int middle = array.length / 2;
            int[] left = new int[middle];
            int[] right = new int[array.length - middle];
    
            
            for (int i = 0; i < middle; i++) {
                left[i] = array[i];
            }
    
             
            for (int i = middle; i < array.length; i++) {
                right[i - middle] = array[i];
            }
    
            
            mergeSort(left);
            mergeSort(right);
    
            
            merge(array, left, right);
        }
    
        private static void merge(int[] array, int[] left, int[] right) {
            int i = 0;  
            int j = 0; 
            int k = 0;  
    
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    array[k++] = left[i++];
                } else {
                    array[k++] = right[j++];
                }
            }
     
            while (i < left.length) {
                array[k++] = left[i++];
            } 
            while (j < right.length) {
                array[k++] = right[j++];
            }
        }
    
        public static void main(String[] args) {
            int[] array = {12, 11, 13, 5, 6, 7};
    
            System.out.println("Original array: " + Arrays.toString(array));
    
            mergeSort(array);
    
            System.out.println("Sorted array: " + Arrays.toString(array));
        } 
}
