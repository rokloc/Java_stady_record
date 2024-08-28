public class Main {
	public static void main(String[] args){
		//勇者生成
		Hero h1 = new Hero();
		//フィールド初期化
		h1.name = "ミナト";
		h1.hp = 100;
		System.out.println("勇者" + h1.name + "を生み出しました");

		h1.sit(5);
		h1.slip();
		h1.sit(25);
		h1.run();
	}
 }
