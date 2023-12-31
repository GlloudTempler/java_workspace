package ch05;

public class FruitMainTest2 {
	public static void main(String[] args) {
		
		Fruit[] fruits = new Fruit[5];
		fruits[0] = new Peach("복숭아", 3_000);
		fruits[1] = new Banana("바나나", 2_000);
		fruits[2] = new Peach("복숭아2", 3_300);
		fruits[3] = new Banana("바나나2", 3_500);
		fruits[4] = new Peach("복숭아3", 2_500);
		
		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i] != null) {
				fruits[i].showInfo();
				// 만약 바나나라면 원산지 정보도 함께 출력하시오.
				if(fruits[i] instanceof Banana) {
					String checkOrigin = ((Banana)(fruits[i])).origin;
					System.out.println("원산지 : " + checkOrigin);
				}
			}
		}
		
	}// end main
}// end class
