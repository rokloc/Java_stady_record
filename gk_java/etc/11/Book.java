//抽象クラス
public abstract class TangibleAsset {
	String name;
	int price;
	String color;
	//コンストラクタ
	public TangibleAsset(String name, int price, String color, String isbn) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	//メソッド
	public String getName()
		return (this.name);
	public int getPrice()
		return (this.price);
	public String getColor()
		return (this.color);	
}

//抽象クラスの子インストラクタ
public class Book {
	String isbn;
	//コンストラクタ
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	//メソッド
	public String getIsbn()
		return (this.isbn);

}
//抽象クラスの子インストラクタ
public class Computer {
	String makerName;
	//コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	//メソッド
	public String getmakerName()
		return (this.makerName);

}












