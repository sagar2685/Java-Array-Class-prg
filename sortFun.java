package ArrayClass;
import java.util.Arrays;
public class sortFun {

	public static void main(String[] args) {
//Sorts the complete array in ascending order. 
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        // To sort the array using normal sort
        Arrays.sort(intArr, 1, 3);
  // Arrays.sort(originalArray, fromIndex, endIndex)
        System.out.println("Integer Array: "
                           + Arrays.toString(intArr));
//toString(originalArray) :-It returns a string representation of the contents of this array. The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by 
        //the characters a comma followed by a space. Elements are converted to strings as by String.valueOf() function.

	}

}
