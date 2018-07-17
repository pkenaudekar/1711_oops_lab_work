package bubblesort;
import bubblesort.bubbleSort;
import java.util.Arrays;


public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[]{64, 34, 25, 12, 22, 11, 90}; 
		System.out.println("Array Before sorting:" +Arrays.toString(arr));
	    Integer n = arr.length;


	    bubbleSort.bubblesort(arr, n);
	    System.out.println("Sorted array:" +Arrays.toString(arr));
	
	}

}
