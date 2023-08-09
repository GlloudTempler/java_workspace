package pickingMachine;

import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Prize[] prizes = new Prize[12];
		Student student1 = new Student("이즈리얼", 10_000);
				
		prizes[0] = new Candy("알사탕", 500);
		prizes[1] = new Candy("청포도", 300);
		prizes[2] = new Candy("썬키스트", 200);
		prizes[3] = new Chocolate("가나", 1_000);
		prizes[4] = new Chocolate("허쉬", 1_500);
		prizes[5] = new Chocolate("크런키", 1_200);
		prizes[6] = new Snack("에이스", 1_000);
		prizes[7] = new Snack("초코파이", 300);
		prizes[8] = new Snack("뿌셔뿌셔", 700);
		prizes[9] = new Snack("포카칩", 1_700);
		prizes[10] = new Candy("츄파츕스", 300);
		prizes[11] = new Chocolate("킨더", 1_000);

		
		
		while (true) {
			System.out.println("------------");
			System.out.println("insert coin");
			System.out.println("1. Y 2. N");
			int i = sc.nextInt();
			if (i == 1) {
				int a = (int) (Math.random() * 12);
				prizes[a].showPrize();
				student1.insertCoin();
				student1.showInfo();
				int e = prizes[a].price;
				student1.earn(e);
				continue;
			} else if (i == 2) {
				System.out.println("뽑기를 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}

		}

	} // end main
} // end class
