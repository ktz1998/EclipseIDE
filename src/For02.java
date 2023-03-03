
public class For02 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int number : array) {
			System.out.println("For02 = " + number);
		}
	}
	
	/* 拡張for文の基本構文
	 * for (型 変数名：配列やコレクションの変数) {
    	    ブロック(繰り返し処理)
		}
	 * 配列やコレクションの変数の要素を順番に取得し、
	 * 指定した型の変数に代入しながらブロック内の処理を行う.
	 * 拡張for文は条件式と変化式を記述しないため、
	 * 通常のfor文に比べ、プログラムを簡潔に記述できる.
	 */

}
