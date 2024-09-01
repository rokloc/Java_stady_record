/*
 mainメソッドはすでに完成しています。（変更は禁止です）

mainメソッド内で呼び出している、第一引数の文字列を第二引数の回数分表示するdisplayメソッドを定義してください。


【実行結果】

テスト
テスト
テスト
テスト
テスト*/

public class MethodBasicPractice {
    public static void main(String[] args) {
        // displayメソッドの呼び出し
        display("テスト", 5);
    }
    // ここにdisplayメソッドを定義してください
    private static void display(String str, int counter) {
    	while (0 < counter){
		System.out.println(str);
		counter--;
    	}
    }
}


