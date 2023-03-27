package practice;

public class 演習10章解説 {

}

/*★解説
「index」変数が、配列のサイズ（array.length）以上の場合、「throw」文で、例外をスローする。*/

// validIndexメソッドを作成
// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
// ・サイズの範囲外なら、IllegalArgumentExceptionをスロー
public static void validIndex(int[] array, int index) {}
    // 配列のサイズは、lengthで取得
    if (array.length <= index) {
        // throw文で、例外をスロー
        throw new IllegalArgumentException(index + " はサイズの範囲外です");
    }
    System.out.println("インデックス " + index + " の要素は " + array[index] + " です");
}

/*「try」ブロックで、throwSQLExceptionメソッドを呼び出して、「catch」文で処理。
例外発生時にもメッセージを出力するため、「finally」ブロックに処理を記述。
※ throwSQLExceptionメソッドから、検査例外がスローされるため、
「catch」文で処理しない場合は、さらに「throws」文でスローする必要がある。*/

// try-catch文を記述
// ・throwSQLExceptionメソッドを呼び出し
// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
try {
    Chapter10.throwSQLException();
} catch (SQLException e) {
    System.out.println("SQLExceptionが発生しました");
    // printStackTraceでスタックトレースを出力
    e.printStackTrace();
} finally {
    // 例外発生しても出力するため、finallyブロックに記述
    System.out.println("throwSQLExceptionの呼び出し終了");
}
