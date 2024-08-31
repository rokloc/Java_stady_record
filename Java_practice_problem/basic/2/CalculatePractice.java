/*
 コメントで指示された値を出力するようにSystem.out.println()の丸括弧の中に、演算を書いてみましょう。

下記、【実行結果】と同じ内容が出力されるようにしてください。

（例）
// 1 足す 2 引く 3 は？
System.out.println(1 + 2 - 3);


【実行結果】

144
7
6
0.6
a
 */

public class CalculatePractice {
    public static void main(String[] args) {
        // 5 と 6 と 7 を足した合計に 8 を掛けた値は？
        System.out.println((5 + 6 + 7) * 8);
        // 7 と 8 を足した値を 5 で割った値に、
        // 6 から 4 を引いた値に 2 を掛けた値を足した値は？
        System.out.println(((7 + 8) / 5) + (6 - 4) * 2);
        // 1000 を 7 で割ったあまりは？
        System.out.println(1000 % 7);
        // 6 を 5 で割った値を、さらに 2 で割った正確な値は？
        System.out.println((double)(6 / 5) / 2);
        // アルファベットの大文字 'A' に 32 を足した文字は？
        System.out.println((char)('A' + 32));
    }
}












