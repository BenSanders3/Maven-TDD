import static org.junit.Assert.*;
import model.MemoUtil;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class TestMemo1 {
	String memo = "Kelli";
	MemoUtil memoUtil = new MemoUtil(memo);
	
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		assertEquals(memo, memoUtil.printMemo());
	}
	
	@Test
	public void testMemoLength() {
		int memoLength = memo.length();
		assertTrue(memoLength == memoUtil.returnMemoLength());
	}
	
	@Test
	public void testMemoNotNull() {
		assertNotNull(memoUtil.printMemo());
	}

}
