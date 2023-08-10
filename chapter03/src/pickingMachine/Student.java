package pickingMachine;

public class Student {
	
	String name;
	int money;
	int earn;
	
	public Student (String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void insertCoin() {
		this.money -= 1_000;
	}
	
	public void earn(int price) {
		earn += price;
		System.out.println("획득한 상품의 가치는 " + earn + "이다.");
	}
	
	public void showInfo() {
		System.out.println(this.name + "의 남은 용돈은" + money + "이다.");
	}
	
}
