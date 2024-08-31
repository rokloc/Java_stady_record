/*
 問題1-1
VariablePracticeクラスのmainメソッドをコメントの指示通りに、プログラムを記述してみましょう。

下記、【実行結果】と同じ内容が出力されるようにしてください。


【実行結果】

みかんの価格：130円
みかんの個数：6個
みかんの総価格：780円
 */

public class VariablePractice {
    public static void main(String[] args) {
        // みかんの価格を表現するint型の変数を宣言してください。
	    int mikan_value;
        // みかんの価格変数に130を代入してください。
	    mikan_value = 130;
        // みかんの個数を表現するint型の変数を宣言し、
	    int mikan_count;
        // 初期値として6を代入してください。（変数名はおまかせします）
	    mikan_count = 6;
        // みかんの総価格を表現するint型の変数を宣言し、
	    int mikan_all_value;
        // 初期値に「みかん価格変数の値×みかん個数変数の値」の演算結果
	    mikan_all_value = 780;
        // みかん価格変数の値を出力してください。
	    System.out.println("みかんの価格:" + mikan_value);
        // みかん個数変数の値を出力してください。
	    System.out.println("みかんの個数:" + mikan_count);
        // みかん総価格変数の値を出力してください。
	    System.out.println("みかんの総価格:" + mikan_all_value);
    }
}

















