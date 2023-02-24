
public class If02 {
	public static void main(String[] args) {
		/* else-if文、else文の基本構文↓
		 * if (条件式) {
			    ブロック(処理文);
			} else if (条件式) {
			    ブロック(処理文);
			} else if (条件式) {
			    ブロック(処理文);
			} else {
			    ブロック(処理文)
			}
		 */
		int number = 7;
		if (number < 5) {
			System.out.println(number + "は5未満です");
		} else if (number < 10) {
			System.out.println(number + "は5以上、10未満です");
		} else if (number < 15) {
			System.out.println(number + "は10以上、15未満です");
		} else {
			System.out.println(number + "は15未満ではないです");
		}
		
		/* if文の条件式を評価した結果が「false」の場合、
		 * 最初のelse-if文の条件式を評価し、結果が「true」の場合は
		 * ブロック内の処理が実行され、「false」の場合は次のelse-if文の条件式を評価.
		 * else文は、全てのif文とelse-if文の評価結果が「false」の場合に
		 * ブロック内の処理が実行.
		 */
	}

}
