public class Array {
	public static void main(String[] args) {
		int[]	Num_Array = {98, 99, 100, 96, 95};
		int	sum;
		int	avarage;
		int	i;

		avarage = 0;
		sum = 0;
		for(i = 0; i < 5; i++) {
			sum += Num_Array[i];
		}
		avarage = sum / i;
		System.out.println("平均点は" + avarage + "点です。");
	}
}
