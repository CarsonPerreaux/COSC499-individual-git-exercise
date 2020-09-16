package sortedArrayDemo;
import java.util.*;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a string array to sort
		String[] myStringArray = new String[] {"hello", "how", "are", "you"};
		sortStringArray(myStringArray);
		printStringArray(myStringArray);
		
	}
	
	// method used to sort string arrays
	public static void sortStringArray(String[] strArr) {
		Arrays.sort(strArr);
	}
	
	// method used to print string array items
	public static void printStringArray(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
