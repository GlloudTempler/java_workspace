package lunchPick;

public class LunchMenus {
	
	private String name;
	
	public LunchMenus (String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	// 메뉴 이름 출력
	public void showName() {
		System.out.println(this.name);
	}
}
