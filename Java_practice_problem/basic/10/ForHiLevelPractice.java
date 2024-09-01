/*問題1-10
変数levelは山の段数を表しています。

for文をネストして、次の図形を作成してください。

なお、山の左側には全角スペースを使用してください。
（実行結果は見やすさのため白い四角で表します）


【実行結果】

□ □ □ □ ■
□ □ □ ■ ■ ■
□ □ ■ ■ ■ ■ ■
□ ■ ■ ■ ■ ■ ■ ■
■ ■ ■ ■ ■ ■ ■ ■ ■
*/


public class ForHiLevelPractice {
    public static void main(String[] args) {
        // 山の段数を表す変数
        int level = 5;
        // for文の開始
    	for (int y = 0; y < level; y++) {
		for (int x = 0; x < level + y; x++) {
			if (x < 4 - y)
				System.out.print("□");
			else if(4 - y <= x && x < level + y)
				System.out.print("■");

		}	
		System.out.println("");
	
	}
    }
}
/*
y0 + 4 = 4	4 - y
y1 + 3 = 4
y2 + 2 = 4
y3 + 1 = 4

y4 + 0 = 4
*/
