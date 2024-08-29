public class Matango {
	int hp = 50;
	char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println("きのこ" + this.suffix + "の攻撃");
		System.out.println("10ダメージ");
		h.hp -= 10;
	}
}

public PoisonMatango extends Matango {
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	int Number_of_Attacks = 5;
	public void attack(Hero h) {
		super.attack(h);
		if (Number_of_Attacks != 0) {
			System.out.println("更に胞子をばらまいた");
			int damege = this.hp / 5;
			this hp -= damege;
			System.out.println(damege + "ポイントのダメージ");
			this.Number_of_Attacks--;
		}
	}
	
		
	}
}
	

