

package ArrayClass;
import java.util.Arrays;
public class mismatch {
	public static void main(String[] args)
    {
//Finds and returns the index of the first unmatched element 
//between the two specified arrays
  
        // Get the Arrays
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        // Get the second Arrays
        int intArr1[] = { 10, 15, 22 };
  
        // To compare both arrays
       System.out.println("The element mismatched at index: "
                           + Arrays.mismatch(intArr, intArr1));
      
    }
}
