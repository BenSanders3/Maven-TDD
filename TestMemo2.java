import static org.junit.Assert.*;
import model.MemoUtil;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class TestMemo2 {
	String memo = "Robert";
	MemoUtil memoUtil = new MemoUtil(memo);
	
	
	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void test() {
		String memoMessage = "Hi Robert!";
		assertEquals(memoMessage, memoUtil.greetings());
	}

}
