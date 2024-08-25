
public class Main {
    public static void main(String[] args) {
/*
        System.out.println("Hello, World!");
	int	x;
	int	y;
	x = -100;
	y = Math.max(1, x);
	System.out.println(y);	
	
	//Ramdom
	int z;

	z = new java.util.Random().nextInt(100);	
	System.out.println(z);	


	//入力
	String str;

	str = new java.util.Scanner(System.in).nextLine();
	System.out.println(str);	
*/
	System.out.println("あなたの名前を入力して下さい");
	String x = new java.util.Scanner(System.in).nextLine();
	System.out.println("あなたの年齢を入力して下さい");	
	String y = new java.util.Scanner(System.in).nextLine();

	System.out.println(y + "歳の" + x + "さんいらっしゃいこんにちわ");	
    }
}

