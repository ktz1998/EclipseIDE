
public class DoWhile01 {
	public static void main(String[] args) {
		/* do-while文 while文との記述上の違いは条件式の位置
		 * 
		 */
		
		int number = 1;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while(number < 50);
	}

}
