package sortedArrayDemo;
import static org.junit.Assert.*;
import org.junit.Test;

public class SortNumberArrayTest {
	
	@Test
    public void testSortMyIntArray() {
        int[] myIntArr = int[](3,1,2);
        assertEquals(int[1,2,3], SortNumberArray.sortMyIntArray(myIntArr));
	}

}
