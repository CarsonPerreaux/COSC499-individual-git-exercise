package sortedArrayDemo;
import org.junit.Test;

public class SortStringArrayTest {
	@Test
	public void testSortStringArray() 
	{
		String[] myStrArr = new String[] {"there", "world", "hello"};
	    assertEquals(["hello", "there", "world"], SortStringArray.sortStringArray(myStrArr));
	}
	
}
