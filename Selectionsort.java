 
 import java.util.*;
 
 public class Selectionsort { 
	// Time complexity of Selection sort is (n^2)

	public static void main(String[] args) { 
        int arr[] = {9,4,5,7,2};
        for(int i = 0 ; i<arr.length; i++) {
        	int min  = i;
        	for(int j = i+1; j<arr.length; j++) {
        		if(arr[i]>arr[j]) {
        			min = j;
        		} 
        	}
        	int temp = arr[min];
        	arr[min] = arr[i];
        	arr[i] = temp; 
        }
        System.out.println(Arrays.toString(arr));
	}

}