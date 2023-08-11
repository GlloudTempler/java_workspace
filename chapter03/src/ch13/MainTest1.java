package ch13;

import java.util.List;

public class MainTest1 {

	public static void main(String[] args) {
		
		// List list;
		
		// 자바에서 상속은 단일 상속만을 지원
		// 단 Object클래스를 제외하고

		Book book1 = new Book(1, "허균", "홍길동전");
		Book book2 = new Book(2, "흐르는 강물처럼", "파울로코엘료");
		Book book3 = new Book(3, "흐르는 강물처럼", "파울로코엘료");
		
		if(book2 == book3) {
			System.out.println("물리적으로 같다.");
		} else {
			System.out.println("물리적으로 다르다.");
		}
		
		System.out.println("=====================");
		
		if(book2.equals(book3)) {
			System.out.println("논리적으로 같다.");
		} else {
			System.out.println("논리적으로 다르다.");
		}
				
	}// end main
}// end class
