/*あるアパートに住む住人を表すapartmentというString型の変数があります。

配列の1次元目はアパートの階数、2次元目は号室を表現しています。

（つまりapartment[0][1]は1階2号室の住人の名前になります）

キーボードから検索したい人の名前を入力し、アパートにその人が住んでいるかを調査してください。

System.console().readLine() の記述は、キーボードから文字列の入力を受け付けるもので、その値でString型変数nameを初期化しています。

見つかった場合は、「○人目の○○さんは、○階の○号室に住んでいます」と表示してください。

ポイントは同名の方が住んでいる場合を考慮することです。

また、見つからなかった場合は「○○さんはこのアパートには住んでいません」と表示してください。


【実行結果】

検索する名前を入力してください
後藤
1人目の後藤さんは、1階の1号室に住んでいます
2人目の後藤さんは、3階の4号室に住んでいます
3人目の後藤さんは、4階の3号室に住んでいます
検索する名前を入力してください
上戸
上戸さんはこのアパートには住んでいません*/


public class StringArrayPractice {
    public static void main(String[] args) {
        // アパートに住む住人2次元配列変数
        String[][] apartment = {
                    {"後藤", "矢口", "石川", "吉澤", "藤本"},
                    {"亀井", "小川", "紺野"},
                    {"石川", "安部", "安田", "後藤"},
                    {"石黒", "福田", "後藤"}
                };
        System.out.println("検索する名前を入力してください");
        // 検索するname変数の宣言とキーボード入力値による初期化
        String name = System.console().readLine();
	int human_count = 1;
	//int flag = 0;
        // ここからコーディングしてください
    	for (int y = 0; y < apartment.length; y++) {
		for (int x = 0; x < apartment[y].length; x++) {
			if (name.equals(apartment[y][x])) {
				System.out.println(human_count + "人目の" + name + "さんは、" + (y + 1) + "階の" + (x + 1) + "号室に住んでいます");
				human_count++;
				//flag = 1;

			}
		}

	}
	if (human_count == 1)
		System.out.println(name + "さんは、このアパートには住んでいません");
    }
}





