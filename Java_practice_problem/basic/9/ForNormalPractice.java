/*for文を利用して、10から100までの自然数の中から素数であるものを表示してください。

素数とは、1とその数以外のどんな自然数によっても割り切れない1より大きな自然数のことです。


【実行結果】

11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
 */


public class ForNormalPractice {
    public static void main(String[] args) {
	for (int x = 10; x <= 100; x++) {
		for (int y = 2; y <= x; y++) {
			if (x % y == 0) {
				if (x == y) 
					System.out.println(x);
				break;
			}
		}
	}
    }
}












