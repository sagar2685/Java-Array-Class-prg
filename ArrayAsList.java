package ArrayClass;
import java.util.Arrays;

public class ArrayAsList {

	public static void main(String[] args) {
//Returns a fixed-size list backed by the specified Arrays
		// Get the Array
        int arr[] = { 10, 20, 15, 22, 35 };
  
        // To convert the elements as List
        System.out.println("Integer Array as List: "
                           + Arrays.asList(arr));


	}

}
