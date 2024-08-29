import java.util.Random;

public class Cleric {
	String	name;
	int	hp = 50;
	int	mp = 10;
	final int HP_MAX = 50;
	final int MP_MAX = 10;
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた");
		this.mp -= 5;
		this.hp = HP_MAX;
		System.out.println(this.name + "は、HPが全回復した");
	}
	
	public void pray(int second) {
		int r = new java.util.Random().nextInt(2) + second;

		if (this.hp == HP_MAX)
			System.out.println("HPはすでに満タンだ");
		else if (this.hp + second >= HP_MAX) {
			this.hp = HP_MAX;
			System.out.println("HPは全回復した");
		}
		else {
			this.hp += r;
			System.out.println("HPは" + r + "ポイント回復した");
			System.out.println("現在のHPは" + this.hp + "となった");
		}

	}
}
