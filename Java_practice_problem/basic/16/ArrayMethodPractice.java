/*mainメソッドはすでに完成しています。（変更は禁止です）

mainメソッド内で呼び出している、引数で渡ってくるint配列オブジェクトの各要素の値を合計して、戻り値として返すsumメソッドを定義してください。


【実行結果】

配列の合計値：28*/

public class ArrayMethodPractice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // sumメソッドの呼び出し
        System.out.println("配列の合計値：" + sum(arr));
    }
    // ここにsumメソッドを定義してください
    private static int sum(int[] arr) {
    	int total = 0;
	for (int i = 0; i < arr.length; i++)
		total += arr[i];
	return (total);
    }
}




