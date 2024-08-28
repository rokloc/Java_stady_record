//ヒーローの金型

public class Hero {
	String name;
	int hp;

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");	
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒眠った");
		System.out.println(this.name + "はHPが" + sec + "回復した");
	}

	public void slip() {
		this.hp -= -5;
		System.out.println(this.name + "は転んだ");
		System.out.println("5ダメージ");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}

