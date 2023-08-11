package ch11;

public class Television extends HomeAppliances{

	@Override
	public void turnOn() {
		System.out.println("TV에 전원을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV에 전원을 끈다.");
	}
		
}
