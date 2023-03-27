package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
    public static void main(String[] args) {
        try {
            Exception04.readFile("exception.txt");		// readFileメソッドを呼び出し
        } catch (FileNotFoundException e) {	// 呼び出し元も例外処理を記述しないとコンパイルエラーになる
            System.out.println("FileNotFoundException例外が発生");		// 例外処理が実行される
        }
        System.out.println("プログラム終了");		// catch文で例外処理されるので、処理が実行される
    }

     // 検査例外のFileNotFoundException例外をスロー
    public static void readFile(String fileName) throws FileNotFoundException {
        System.out.println("ファイルの読み込み開始");
        FileReader fr = new FileReader(fileName);		// ファイルが存在しないため例外が発生
        System.out.println(fileName + "の読み込み完了");
    }
}