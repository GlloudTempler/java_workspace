package lunchPick;

public class LuchPickMainTest {
	public static void main(String[] args) {

		LunchMenus[] LM = new LunchMenus[100];

		LM[0] = new LunchMenus("국밥");
		LM[1] = new LunchMenus("칼국수");
		LM[2] = new LunchMenus("돈까스");
		LM[3] = new LunchMenus("불백");
		LM[4] = new LunchMenus("중식");
		LM[5] = new LunchMenus("밀면");

		for (int i = 0; i < LM.length; i++) {
			int a = (int) (Math.random() * 100);
			if (LM[a] != null) {
				LM[a].showName();
				break;
			}
		}
	}// end main
}// end class
