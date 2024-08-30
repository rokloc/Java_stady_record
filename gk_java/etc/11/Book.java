
public abstract class Asset {
	String name;
	int price;
	//コンストラクタ
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//メソッド
	public String getName()
		return (this.name);
	public int getPrice()
		return (this.price);
}



/*
public abstract class IntangibleAsset {

}
*/

//抽象クラス
public abstract class TangibleAsset extends Asset{
	String color;
	//コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	//メソッド
	public String getColor()
		return (this.color);	
}

//抽象クラスの子インストラクタ
public class Book extends TangibleAsset{
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
public class Computer extends TangibleAsset{
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












