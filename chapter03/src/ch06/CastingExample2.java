package ch06;

public class CastingExample2 {
	public static void main(String[] args) {

		// 다형성, 업캐스팅(Upcasting)
		// 업캐스팅은 하위 클래스의 객체를 상위 클래스 타입으로 변환하는 것을 말한다.
		// 이 경우에는 데이터 손실이 없다.
		// 업캐스팅은 자동적으로 이루어지므로 별도의 형변환 연산이 필요없다.

		Animal animal = new Bird(); // <-- 업캐스팅

		// 다운캐스팅
		// 업캐스팅 된 객체를 다시 원래의 하위 클래스 타이으로 변환하는 것
		// 수동적으로 형변환 연산자를 사용하여 이루어짐.
		// 업캐스팅된 객체를 하위 클래스에 메서드나 속성을 사용하기 위해 필요

		Bird bird = (Bird) animal;

		Animal[] animals = new Animal[3];

		animals[0] = new Animal();
		animals[1] = new Bird();
		animals[2] = new Animal();

		// 0 -- Animal --> if --> false
		// 1 -- Bird --> if --> true
		// 2 -- Animal --> if --> false

		for (Animal a : animals) {
			a.makeSound();
			// a.fly; 데이터 타입을 확인하고 싶다면 instanceOf 연산자
			if (a instanceof Bird) {
				Bird targetBird = (Bird)a;
				targetBird.fly();
			}
			System.out.println("---------------");
		}

//		for (int i = 0; i < animals.length; i++) {
//			
//		}

	}// end main
}// end class
