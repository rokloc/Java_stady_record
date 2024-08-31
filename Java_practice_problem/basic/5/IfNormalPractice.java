/*int型の変数ageが宣言してあります。変数ageは年齢を表しています。

変数ageの値が20以上の場合は「成人です」と表示します。

また、変数ageの値が20未満かつ0以上の場合は「未成年です」と表示します。

それ以外の場合は「エラー」と表示します。


さらに、未成年の場合に限り次のような表示も行います。変数ageの値が6未満または14より大きい場合は「今は義務教育を受けていません」と表示し、それ以外の場合は「今は義務教育を受けています」と表示します。

【実行結果】

年齢：25
成人です
年齢：18
未成年です
今は義務教育を受けていません
年齢：12
未成年です
今は義務教育を受けています
年齢：-2
エラー*/

public class IfNormalPractice {
    public static void main(String[] args) {
        // 年齢変数の宣言と初期化
        int age = 20;        // ←値を変更しながら実行
        System.out.println("年齢：" + age);
        // if文の開始
	if (20 <= age)
		System.out.println("成人です");
	else if (0 <= age && age< 20) {
		System.out.println("未成人です");
		if (age < 6 || 14 < age)
			System.out.println("今は義務教育を受けていません");
		else
			System.out.println("今は義務教育を受けています");

	}
	else
		System.out.println("エラー");

    }
}


















