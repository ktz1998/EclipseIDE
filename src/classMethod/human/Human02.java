package classMethod.human;    //パッケージ宣言

public class Human02 {
	public String name;    //メンバー変数
	public int age;    //メンバー変数
	
	public Human02() {      //引数なしのコンストラクタ
		name = "山田";
		age = 20;
	}
	
	public Human02(String name, int age) {     //引数2つのコンストラクタ
		this.name = name; 
		this.age = age;
	}

}
