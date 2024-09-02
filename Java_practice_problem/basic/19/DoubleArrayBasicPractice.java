/*int二次元配列型の変数arrが宣言されています。

すべての要素を順番に表示するプログラムを、for文を使って記述してください。

次に、すべての要素を逆順に表示するプログラムを、for文を使って記述してください。


【実行結果】

112233445566778899
998877665544332211*/

public class DoubleArrayBasicPractice {
    public static void main(String[] args) {
        // int2次元配列型変数arrの宣言と初期化
        int[][] arr = {{11, 22, 33}, {44}, {55, 66}, {77, 88, 99}};
        // 配列のすべての要素を順に表示してください
        for (int x = 0; x < arr.length; x++) {
		for (int y = 0; y < arr[x].length; y++)
			System.out.print(arr[x][y]);
	
	}
	System.out.print("\n");
	
	// 配列のすべての要素を逆から表示してください
    	for (int a = arr.length - 1; 0 <= a; a--) {
		for (int b = arr[a].length - 1; 0 <= b; b--)
			System.out.print(arr[a][b]);
	}	
    }
}





