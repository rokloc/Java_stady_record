/*double型の2つの変数（身長height と 体重weight）が宣言してあります。

次の手順にしたがって、肥満度（BMI）測定を行ってください。

double型の変数bmiを宣言します。
変数bmiにBMI値を格納します。BMI値の算出方法は以下の通りです。
BMI = （体重kg） ÷ （身長m の二乗）
変数bmiの値を次の形式で出力します。
「あなたのBMI値は○○です」
最後に、変数bmiの値に応じて次のようなメッセージを出力します。
26.5以上　・・・　「肥満です」
25.5未満24以上　・・・　「太り気味です」
24未満20以上　・・・　「普通です」
20未満0以上　・・・　「スリムです」
それ以外　・・・　「エラーです」

【実行結果】

身長：170.0（cm）
体重：88.0（kg）
あなたのBMI値は30.449826989619382です
肥満です
身長：170.0（cm）
体重：55.0（kg）
あなたのBMI値は19.031141868512112です
スリムです*/

public class IfCalculatePractice {
    public static void main(String[] args) {
        double height = 170.0;        // ←値を変更しながら実行
        double weight = 55.0;         // ←値を変更しながら実行
        System.out.println("身長：" + height + "（cm）");
        System.out.println("体重：" + weight + "（kg）");
        // BMI値の算出と表示
	double bmi = weight / Math.pow(170 / 60, 2);
	System.out.println("あなたのBMI値は" + bmi + "です");
	if (26.5 <= bmi)
		System.out.println("あなたは肥満です");
	else if (24 <= bmi && bmi < 25.5)
		System.out.println("太り気味です");
	else if (20 <= bmi && bmi < 24)
		System.out.println("普通です");

	else if (0 <= bmi && bmi < 20)
		System.out.println("スリムです");
	else
		System.out.println("エラー");

    }
}
