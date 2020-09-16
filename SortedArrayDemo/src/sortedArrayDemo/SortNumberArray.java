package sortedArrayDemo;
import java.util.*;

public class SortNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// An unsorted integer array that is to be sorted.
		int[] myIntArray = new int[] { 2, 5, 4, 7, 3, 1, 9, 8, 6 };
		sortMyIntArray(myIntArray);
		printMyIntArray(myIntArray);
	}
	
	// A method that takes in an integer array and returns a sorted array
	public static int[] sortMyIntArray(int[] numArr) {
		Arrays.sort(numArr);
		return numArr;
	}
	
	// Prints the integer array that is passed through as a parameter
	public static void printMyIntArray(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	}
	

}
