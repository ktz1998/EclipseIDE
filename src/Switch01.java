
public class Switch01 {
	public static void main(String[] args) {
		/* switch文の基本構文↓
		 * switch (式（変数や値）){
			case 値:
			    ブロック(処理);
			    break;
			case 値:
			    ブロック(処理);
			    break;
			default:
			    ブロック(処理);
			}
		 */
		
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("ふつうでした");
			break;
		default:
			System.out.println("がんばろう");
		}
		
		/* case文
		 * 変数とcaseの値が一致する場合、ブロック内の処理を実行.
		 * 
		 * break文
		 * break文が処理されると、それ以降のcase文は評価されずに、switch文の分岐処理を終了する.
		 * breakの記述がない場合、それ以降のcase内ブロック処理が実行されて、
		 * 意図しない処理まで実行される可能性があるので注意が必要.
		 * 
		 * default文
		 * 全てcase文の値と一致しない場合、default内のブロックの処理が実行.
		 * 必須ではなく「caseに一致しなければ何もしない」という処理を
		 * 実現したい場合は書かなくてよい.
		 */
	}

}
