package practice;

public class 演習解説 {
	//解説
	//コンストラクタは、「燃費」「残量」の引数を「double」型で定義。
	//引数をフィールドに代入。

	public Car(double fuelCost, double fuelAmount) {
	    this.fuelCost = fuelCost;
	    this.fuelAmount = fuelAmount;
	}

	//moveメソッドは、「int」型を引数にして定義。
	//「km + " km 走ります"」を出力。
	//残量から走った分の燃料を計算して、引き算。

	public void move(int km) {
	    System.out.println(km + " km 走ります");
	    this.fuelAmount -= (km / fuelCost);
	}

	//フィールドの「fuelAmount」をreturn。

	    public double getFuelAmount() {
	        return this.fuelAmount;
	    }

}
