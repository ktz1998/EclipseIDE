
public class While01 {
	public static void main(String[] args) {
		/* while文 指定の条件が「true」の間、繰り返し処理を行なう制御文
		 * while (条件式) {
    		  ブロック（繰り返し処理）
		   }
		 */
		
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}
	}

}
