
public class DoWhile01 {
	public static void main(String[] args) {
		/* do-while文 while文との記述上の違いは条件式の位置
		 * do {
    			ブロック（繰り返し処理）
			} while (条件式);
		 */
		
		int number = 1;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while(number < 50);
		
		/* まず、ブロックの処理を実行し、処理が完了した後に条件式を評価.
		 * そのため、仮にはじめから条件式の結果がfalseであっても、
		 * while文とは異なり、最低1度はブロックの処理が実行される.
		 * 
		 * while文とdo-while文の違いは、条件式をブロックの実行前に評価するか、後に評価するか.
		 * ループ開始時点で、条件が「false」の場合、while文ではブロックが実行されないが、
		 * do-while文ではではブロックが実行される.
		 */
	}

}
