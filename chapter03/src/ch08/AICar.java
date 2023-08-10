package ch08;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행");
		System.out.println("스스로 방향전환");
	}

	@Override
	public void stop() {
		System.out.println("스스로 차를 정지");
	}
	// run() 메서드는 final 키워드를 사용했기 때문에 재정의 불가능
}