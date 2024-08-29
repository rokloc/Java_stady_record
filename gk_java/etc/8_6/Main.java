
public class Main {
	//Mainクラス
	public static void main(String[] args) 
	{
		Cleric c1 = new Cleric();	//c1というインスタンスを生成
		c1.name = "Black";
		System.out.println(c1.hp);
		c1.selfAid();

		c1.hp -= 10;
		c1.pray(3);
	}
}

