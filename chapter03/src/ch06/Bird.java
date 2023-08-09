package ch06;

public class Bird extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("새가 지저귄다.....");
	}
	
	public void fly() {
		System.out.println("새가 난다......");
	}
}
