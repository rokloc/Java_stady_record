/*
int型の変数valueが宣言してあります。変数valueは任意の整数をあらわしています。

まずは変数valueの値が偶数か奇数かを判定します。偶数の場合は「偶数です」と表示し、奇数の場合は「奇数です」と表示します。

負の数値でもきちんと偶数・奇数を判定してください。

次に、変数valueの値が3の倍数、4の倍数、5の倍数であるかの判定を行います。

3の倍数の場合は「3の倍数です」と表示します。

4の倍数の場合は「4の倍数です」と表示します。

5の倍数の場合は「5の倍数です」と表示します。

3の倍数かつ4の倍数の数値もあることに注意してください。

今回の練習問題はif文だけを使用し、繰り返し構文は使わないでください。


【実行結果】

value：16
偶数です
4の倍数です
value：-15
奇数です
3の倍数です
5の倍数です
value：60
偶数です
3の倍数です
4の倍数です
5の倍数です
 
*/

public class IfBasicPractice {
    public static void main(String[] args) {
        // 整数変数の宣言と初期化
        int value = 60;        // ←値を変更しながら実行
        System.out.println("value：" + value);
        // if文の開始
	if ((value % 2) == 0)
		System.out.println("偶数です");
	else
		System.out.println("奇数です");

	if ((value % 3) == 0)
		System.out.println("3の倍数です");
	if ((value % 4) == 0)
		System.out.println("4の倍数です");
	if ((value % 5) == 0)
		System.out.println("5の倍数です");
    }
}









