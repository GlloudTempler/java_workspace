package ch12;

public class ToyRobot implements Remotecontroller, SoundEffect{
	
	int width;
	int height;
	String color;
	String name;
	
	@Override
	public void turnOn() {
		System.out.println("장난감 작동");
	}
	
	@Override
	public void turnOff() {
		System.out.println("장난감 다운");
	}	
	
	public void notification() {
		System.out.println("ㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷ");
	}
	
}
