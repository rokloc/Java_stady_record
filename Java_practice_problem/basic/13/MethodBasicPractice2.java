/*mainメソッドはすでに完成しています。（変更は禁止です）

mainメソッド内で呼び出している、第一引数と第二引数の値を、第三引数の種類によって計算するcalcメソッドを定義してください。

ただし、3つの引数の型はすべてint型とし、第三引数の値が0のときは足し算、1のときは引き算、2のときは掛け算、3のときは割り算とします。

第三引数の値が0〜3以外の場合は、第一・第二引数の値にかかわらず0を返してください。

また、条件分岐には必ずswitch文を使用してください。

注意
今回は0による除算の対応は不要とします。


【実行結果】

足し算：24
引き算：12
掛け算：108
割り算：3*/


public class MethodBasicPractice2 {
    public static void main(String[] args) {
        int a = 18;
        int b = 6;
        // calcメソッドの呼び出し
        System.out.println("足し算：" + calc(a, b, 0));
        System.out.println("引き算：" + calc(a, b, 1));
        System.out.println("掛け算：" + calc(a, b, 2));
        System.out.println("割り算：" + calc(a, b, 3));
    }
    // ここにcalcメソッドを定義してください
    private static int calc(int a, int b, int c) {
    	if (c == 0)
		return (a + b);
	else if (c == 1)
		return (a - b);
	else if (c == 2)
		return (a * b);
	else if (c == 3)
		return (a / b);
	return (0);
    }

}












