package ch08;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
		System.out.println("사람이 드리프트를 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아 정지합니다.");
	}

}
