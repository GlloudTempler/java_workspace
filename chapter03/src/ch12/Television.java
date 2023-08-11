package ch12;

public class Television extends HomeAppliances implements Remotecontroller{

	@Override
	public void turnOn() {
		System.out.println("TV의 전원을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV의 전원을 끈다.");
	}
		
}
