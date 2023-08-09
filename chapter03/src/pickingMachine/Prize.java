package pickingMachine;

public class Prize {
	
	String name;
	int price;
	
	public Prize(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showPrize() {
		System.out.println("-----------------------------");
		System.out.println(this.name + "을(를) 뽑으셨습니다.");
		System.out.println(this.price + "의 가치입니다.");
	}
	
}
