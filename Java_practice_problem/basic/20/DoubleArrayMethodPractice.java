/*mainメソッドはすでに完成しています。（変更は禁止です）

mainメソッド内で呼び出している、第一引数のint二次元配列型の値の中から、第二引数のint型の値がいくつ存在するかをカウントするcountメソッドを定義してください。


【実行結果】

1の個数：4
7の個数：3*/

public class DoubleArrayMethodPractice {
    public static void main(String[] args) {
        // int二次元配列変数の宣言と初期化
        int[][] arr = {{1, 5, 8}, {2, 4, 7}, {1, 9, 3, 5}, {4, 2},
                            {6, 1, 9, 4}, {7, 3, 8, 1}, {8, 4, 3, 9, 7}};
        // 検索する数値変数の宣言と初期化
        int target = 1;
        // countメソッドの呼び出し
        System.out.println(target + "の個数：" + count(arr, target));
        // 検索する数値の変更
        target = 7;
        // countメソッドの呼び出し
        System.out.println(target + "の個数：" + count(arr, target));
    }

    private static int count(int[][] arr, int target) {
	int counter = 0;
    	for (int x = 0; x < arr.length; x++) {
		for (int y = 0; y < arr[x].length; y++) {
			if (arr[x][y] == target)
				counter++;
		}
	}
	return (counter);
    }

}











