package ch04;

public class MainTest1 {
	public static void main(String[] args) {
		
		// 자동차라는 클래스를 메모리에 올리기
		Engine engine1 = new Engine("V8", 2_000);
		Engine engine2 = new Engine("V6", 1_000);
		Car car1 = new Car("bentz", 8_000, engine2);
		car1.getEngine().getName(); 
		
	} // end main
} // end class
