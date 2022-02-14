package ArraysPracticeSets;
import java.util.Arrays;

public class ArrayApp {

	public static void main(String[] args) {
		
		int[] numbers = {12,4,3,67,89,76};
		System.out.println (Arrays.toString(numbers));
		
		boolean isSorted = IntArrayTools.isSorted(numbers);
		
		System.out.println("The array is sorted: " +  isSorted);
		System.out.println("Sorted numbers from smallest to largest are: " + (Arrays.toString(numbers)));
		
		
		
		IntArrayTools.sort(numbers);
		System.out.println("Sorted numbers from largest to  smallest are: " + (Arrays.toString(numbers)));
		
		
		
		int[] nums = {67,54,23,98,4,2,36};
		System.out.println("Unsorted numbers : " + (Arrays.toString(nums)));
		
		 int size = nums.length;
		
		
		IntArrayTools.quickSort(nums, 0, size - 1);
		System.out.println("Sorted numbers using QuickSort Algorithm : " + (Arrays.toString(nums)));
		
		
		int key = 3;
		boolean chopSearch = IntArrayTools.chopSearch(numbers);
		System.out.println("Number is found using chopSearch: " + key + " " + chopSearch);
	

	
	
	
	
	
	}
	
	
	
	
	

}
