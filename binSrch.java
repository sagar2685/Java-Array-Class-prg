package ArrayClass;
import java.util.Arrays;
public class binSrch {

	public static void main(String[] args)
    {
		//Searches for the specified element 
		//in the array with the help of the Binary Search Algorithm
  
        // Get the Array
        int arr[] = { 10, 20, 15, 22, 35 };
  
        Arrays.sort(arr);
  
        int key = 22;
  
        // Print the key and corresponding index
        System.out.println(
           key + " found at index = "
            + Arrays.binarySearch(arr, key));
    }
}
	
