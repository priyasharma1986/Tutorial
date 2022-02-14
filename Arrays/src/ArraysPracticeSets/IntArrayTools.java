package ArraysPracticeSets;

public class IntArrayTools {
	

	
		public static boolean isSorted(int[]numbers) { // method to sort numbers from smallest to largest
			
		
		    	
			
			
			
			
			for(int i = 0; i<numbers.length; i++) {
				for (int j = 0; j< (numbers.length - 1) - i; j++) {
					
					if(numbers[j] > numbers[j + 1]) {
						
						int temp = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[ j+ 1] = temp;
				
				 
					
			
					}
					return true;

				}
		
			}
			return false;
			
}
		
		
		public static int[] sort(int[]numbers) { // method to sort numbers from largest to smallest
			for(int i = 0; i<numbers.length; i++) {
				for (int j = 0; j<numbers.length-1; j++) {
					

					if(numbers[j] < numbers[j + 1]) {
						
						int temp = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[ j+ 1] = temp;
				
					
				}
			}
		}
		return numbers;	
			
}
	
		public static  int partition(int nums[], int low, int high) {
			int pivot = nums[high];
			
			int i = low -1;
			
			
			 for (int j = low; j < high; j++) {
			      if (nums[j] <= pivot) {
			    	  i++;
			    	  int temp = nums[i];
			          nums[i] = nums[j];
			          nums[j] = temp;
			        }
			      }
			 int temp = nums[i + 1];
			    nums[i + 1] = nums[high];
			    nums[high] = temp;
			    
			   
         return (i + 1);
			    
		}
		
		public static void quickSort(int array[], int low, int high) {
		    if (low < high) {
		    	
		        int pi = partition(array, low, high);
		        quickSort(array, low, pi - 1);
		        quickSort(array, pi + 1, high);

		    }
		    

		    	
		    }
		
		
		public static boolean chopSearch(int[]numbers) {
			int key = 3;
			for (int n : numbers) {
			      if (n == key) {
			        return true;
			        
			  
			      }
			}
			
			
			
			
			
			
			return false;
			
		}
}


		