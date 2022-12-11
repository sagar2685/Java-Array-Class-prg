package ArrayClass;
import java.util.Arrays;
public class fillFun {

	public static void main(String[] args) {
// fill(originalArray, fillValue)
//Assigns this fill value to each index of this arrays.
		 int intArr[] = { 10, 20, 15, 22, 35 };
		  
	        int intKey = 22;
	  
	        Arrays.fill(intArr, intKey);
	  
	        // To fill the arrays
	        System.out.println("Integer Array on filling: "
	                           + Arrays.toString(intArr));
	}

}
