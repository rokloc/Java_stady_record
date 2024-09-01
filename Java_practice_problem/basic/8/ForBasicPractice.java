/*21から29までの数値を調査します。

その数値が3から9までの倍数である場合は「○は△の倍数です」と出力します。


【実行結果】

21は3の倍数です
21は7の倍数です
24は3の倍数です
24は4の倍数です
24は6の倍数です
24は8の倍数です
25は5の倍数です
27は3の倍数です
27は9の倍数です
28は4の倍数です
28は7の倍数です*/

public class ForBasicPractice {
    public static void main(String[] args) {
	    for (int x = 21; x < 30; x++) {
	    	for (int y = 3; y < 10; y++) {
			if (x % y == 0)
				System.out.println(x + "は" + y + "の倍数です");
		}
	    }
    }
}
