
public interface Thing{
	//メソッド
	public double getWeight();
	public void setWeight(double weight);
}



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
public abstract class TangibleAsset extends Asset implements Thing {
	String color;
	double weight;
	//コンストラクタ
	public TangibleAsset(String name, int price, String color, double weihgt) {
		super(name, price);
		this.color = color;
		this.weihgt = weight;
	}

	//メソッド
	public String getColor()
		return (this.color);
	public double getWeight()
		return (this.weihgt);
	public void setWeight(double weight)
		this.weight = weight;
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












