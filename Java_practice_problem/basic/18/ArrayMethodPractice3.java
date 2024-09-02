/*mainメソッドはすでに完成しています。（変更は禁止です）

mainメソッド内で呼び出している、2つのint配列オブジェクトを引数に取り、共通する数値の個数を調べて戻り値として返すcommonメソッドを定義してください。

（今回のサンプルでは10、17、38、55の4つの数値が2つの配列に共通しています。）


【実行結果】

共通する数値の個数：4*/

public class ArrayMethodPractice3 {
    public static void main(String[] args) {
        int[] arr = {13, 90, 10, 79, 101, 25, 88, 123, 38, 5, 16, 64, 55, 17};
        int[] arr2 = {38, 118, 26, 17, 41, 53, 10, 88, 92, 102, 67, 22, 55};
        // commonメソッドの呼び出し
        System.out.println("共通する数値の個数：" + common(arr, arr2));
    }
    // ここにcommonメソッドを定義してください
    private static int common(int[] arr, int[] arr2) {
	int count = 0;
    	for (int x = 0; x < arr.length; x++) {
		for (int y = 0; y < arr2.length; y++) {
			if (arr[x] == arr2[y]) {
				count++;
				break;
			}
		}
	}
	return (count);
    }
}


