import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  /*
   
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  */

  @Test
  public void testReversed2() {
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversed() {
    int[] input3 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input3));
  }

/*
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = {3, 2, 1};
    assertArrayEquals(new int[]{1, 2, 3}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {2.0, 2.0, 2.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0);
  }
 */
}
