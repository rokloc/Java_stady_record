/*（この問題は Eclipseを使うとエラーになるケースがあります）

String型の変数inputPasswordが宣言してあります。

System.console().readLIne() の記述は、キーボードから文字列の入力を受け付けるもので、その値で変数inputPasswordを初期化しています。

StringImportantPracticeクラスには、正しいパスワードを表現するString型の定数PASSWORDが定義してあります。

キーボードから入力したパスワードの値がパスワード定数の値と等しい場合は「パスワードが一致しました」と表示し、パスワード定数の値と等しくない場合は「パスワードが一致しません」と表示してください。


【実行結果】

パスワードを入力してください
ABC
パスワードが一致しません
パスワードを入力してください
XYZ
パスワードが一致しました
 */

public class StringImportantPractice {
	// 正しいパスワード定数
	private static final String PASSWORD = "XYZ";
	public static void main(String[] args) {
		System.out.println("パスワードを入力してください");
	        // 入力パスワード変数の宣言と初期化
	        String inputPassword = System.console().readLine();
	        // ここからパスワードの一致を調べてください
		if (PASSWORD.equals(inputPassword))
			System.out.println("パスワードが一致しました");
		else
			System.out.println("パスワードが一致しませんでした");
	}	
	}






