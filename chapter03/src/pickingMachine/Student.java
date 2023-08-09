package pickingMachine;

public class Student {
	
	String name;
	int money;
	int
	
	public Student (String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void insertCoin() {
		this.money -= 500;
	}
	
	public void earn(int price) {
		System.out.println("획득한 상품의 가치는 " + price + "이다.");
	}
	
	public void showInfo() {
		System.out.println(this.name + "의 남은 용돈은" + money + "이다.");
	}
	
}
