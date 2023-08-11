package ch12;

public class Refrigerator extends HomeAppliances implements Remotecontroller, SoundEffect{
	
	@Override
	public void turnOn() {
		System.out.println("냉장고 전원을 킨다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("냉장고 전원을 끈다.");
	}
	
	@Override
	public void notification() {
		System.out.println("ㄸㄸㄸㄸㄸㄸㄸ");
	}
}
