package ch12;

public interface Remotecontroller {
	
	// 인터페이스란 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
	// 추상 메서드나 static상수만을 기본적으로 가짐
	

//	public abstract void turnOn();
//	public abstract void turnOff();
	
	//public abstract 생략 가능 - 컴파일러가 넣어줌	
	
	void turnOn();
	void turnOff();
	
}
