package exercise;

class Outer2 {
	int value = 10;
	
	class Inner2 {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer2.this.value);
			
		}
	}
}

public class Exercise7_27 {

	public static void main(String[] args) {
		
		Outer2 outer2 = new Outer2();
		Outer2.Inner2 inner2 = outer2.new Inner2();
		
		inner2.method1();

	}

}


// 30
// 20
// 10





