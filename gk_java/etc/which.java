public class which {
	public static void main(String[] args) {
		System.out.println("今日の運勢は");
		int x;
		x = new java.util.Random().nextInt(5);
		switch (x){
		case 0:
			System.out.println("大吉");
			break;
		case 1:
			System.out.println("中吉");
			break;
		case 2:
			System.out.println("小吉");
			break;
		case 3:
			System.out.println("吉");
			break;
		case 4:
			System.out.println("凶");
			break;
		case 5:
			System.out.println("大凶");
			break;
		}
	}

}
