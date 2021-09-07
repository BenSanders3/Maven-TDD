package model;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class MemoUtil {

		private String memo;
		
		public MemoUtil(String memo) {
			this.memo = memo;
		}
		
		// prints the memo
		public String printMemo() {
			return memo;
		}
		public String greetings() {
			return "Hi " + memo + "!";
		}
		public int returnMemoLength() {
			return memo.length();
		}
}
