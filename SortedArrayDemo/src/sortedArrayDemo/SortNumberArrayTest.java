package sortedArrayDemo;
import static org.junit.Assert.*;
import org.junit.Test;

public class SortNumberArrayTest {
	
	//Test for the int array to see if it is working properly
	@Test
    public void testSortMyIntArray() {
        int[] myIntArr = int[](3,1,2);
        assertEquals(int[1,2,3], SortNumberArray.sortMyIntArray(myIntArr));
	}

}
