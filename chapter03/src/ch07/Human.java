package ch07;

// 추상메서드를 상속받았다면
// 1. 자신 클래스도 추상 클래스가 되어야함
// 2. 추상 메서드를 오버라이드해서 일반 메서드로 변경

public class Human extends Animal {

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("죽창으로 사냥을 한다.");
	}

}
