package ch07_1;

public class DeskTop extends Computer{
	
	// 구현 메서드로 오버라이드
	@Override
	public void display() {
		System.out.println("모니터로 화면 출력");
	}
	@Override
	public void typing() {
		System.out.println("키보드로 타자 입력");
	}
}
