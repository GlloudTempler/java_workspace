package ch05;

public class Animal {
	
	public void move() {
		System.out.println("동물이 움직인다.");
	}
	
	public void eating() {
		System.out.println("동물이 먹이를 먹는다.");
	}

} // end of animal class

class Tiger extends Animal {
	@Override 
	public void move() {
		System.out.println("호랑이가 네 발로 움직인다.");		
	}
	@Override
	public void eating() {
		System.out.println("호랑이가 사냥중이다.");
	}
} // end of tiger

class Human {
	public void move() {
		System.out.println("사람이 두 발로 걷는다.");
	}
	public void eating() {
		System.out.println("사람이 요리를 해 먹는다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽는다.");
	}
} // end of human

