package exercise;

class SutdaCard1 {
	
	// final 선언
	final int num;
	final boolean isKwang;
	
	SutdaCard1() {
		this(1, true);
	}
	
	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Exercise7_14 {

	public static void main(String[] args) {

	SutdaCard1 card = new SutdaCard1(1, true);	

	}

}
