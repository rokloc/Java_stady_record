/*mainメソッドはすでに完成しています。（変更は禁止です）

mainメソッド内で呼び出している、int型の3つの引数の中で、一番小さいものの値を戻り値として返すminメソッドを作成してください。


【実行結果】

整数88、79、96の中で最小の値は79です*/

public class MethodBasicPractice3 {
    public static void main(String[] args) {
        int x = 88;
        int y = 79;
        int z = 96;
        // minメソッドの呼び出し
        System.out.println("整数" + x + "、" + y + "、" + z + "の中で最小の値は");
        System.out.println(min(x, y, z) + "です");
    }
    // ここにminメソッドを定義してください
	private static int min(int x, int y, int z) {
		if (x <= y && x <= z)
			return (x);
		else if (y <= x && y <= z)
			return (y);
		return (z);
	}
}






