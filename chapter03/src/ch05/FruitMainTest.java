package ch05;

public class FruitMainTest {
	public static void main(String[] args) {
		
		// 다형성
		// !용어 - 업캐스팅
		Fruit fruit1 = new Banana("델몬트 바나나", 2_000);
		Fruit fruit2 = new Peach("청도복숭아", 2_500);
		
		fruit1.showInfo();
		fruit2.showInfo();
		
		// 바나나 객체에 origin 변수갑을 출력해보자
		// 업캐스팅 된 상태에서는 컴파일 시점만 확인을 한다.
		
//		System.out.println(fruit1.origin); 오류 발생
		// 컴파일 시점에 어떻게 origin이라는 변수를 출력할까

		// 1 - 다운캐스팅
		Banana banana1 = (Banana)(fruit1);
		System.out.println(banana1.origin);
		
		// 2 - 다운캐스팅
		String checkOrigin = ((Banana)(fruit1)).origin;
		
	} // end main
} // end class
