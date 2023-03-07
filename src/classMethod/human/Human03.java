package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String professsion;

	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.professsion = "プログラマー";
	}

		  //String型の戻り値を返す引数なしのメソッドを定義
	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.professsion;
	}

		  //戻り値を返さない、String型の引数を1つとるメソッドを定義
	public void greet(String friend) {    //String型の値はnullの可能性があるのでチェック
		if (friend == null) {
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
