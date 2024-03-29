package exception;

public class Exception03 {
	public static void main(String[] args) {
		try {
             // divisionメソッドを呼び出し
            Exception03.division(100, 0);
         // ArithmeticExceptionクラスの例外が発生した場合の例外処理
        } catch (ArithmeticException e) {
             // 例外クラスが一致しないので、例外処理が実行されない
            System.out.println("ArithmeticException例外が発生");
         // IllegalArgumentExceptionクラスの例外が発生した場合の例外処理
        } catch (IllegalArgumentException e) {
             // 例外処理が実行される
            System.out.println("IllegalArgumentException例外が発生");
             // キャッチした例外インスタンスをスロー
            throw e;
        }
         // finallyブロックでないので処理が実行されない
		System.out.println("プログラム終了");
	}

	public static void division(int a,int b) {
		System.out.println(a + "÷" + b + "は？");
		if (b == 0) {
			 // 割り算で例外が発生するので、意図的にIllegalArgumentException例外をスロー
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
}

/*●スタックトレース
	実行結果で表示される「Exception in thread ・・・」以降の行は
	スタックトレース。
	スタックトレースとは、例外が発生するまでにメソッドが
	どのような順序で呼び出されているかが記録されたもの。
	例外クラスには、「printStackTrace()」メソッドが用意されているため、
	Javaのプログラム内で出力することもできる。*/