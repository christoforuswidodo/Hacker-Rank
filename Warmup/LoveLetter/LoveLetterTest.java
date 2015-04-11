import static org.junit.Assert.*;

import org.junit.Test;

public class LoveLetterTest{
	@Test
	public void testReductChartoCompare(){
		char test = 'c';
		char comparator = 'a';
		assertEquals(2, LoveLetter.reductCharToCompare(comparator, test));
		test = 'z';
		comparator = 'b';
		assertEquals(24, LoveLetter.reductCharToCompare(comparator, test));
	}

	@Test
	public void testNumReduction(){
		String palin = "abc";
		assertEquals(2, LoveLetter.numReduction(palin));
		palin = "abcd";
		assertEquals(4, LoveLetter.numReduction(palin));

	}

	public static void main(String[] args){
		jh61b.junit.textui.runClasses(LoveLetterTest.class);
	}
}