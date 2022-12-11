package ArrayClass;
import java.util.Arrays;
public class EqualFun {

	public static void main(String[] args) {
		// Get the Arrays
        int intArr[] = { 10, 20, 15, 22, 35 };
  //Checks if both the arrays are equal or not.
        // Get the second Arrays
        int intArr1[] = { 10,15,35  };
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.equals(intArr, intArr1));

	}

}
