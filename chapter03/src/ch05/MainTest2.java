package ch05;

import starcraft.Marine;
import starcraft.Unit;
import starcraft.Zealot;
import starcraft.Zergling;

public class MainTest2 {
	public static void main(String[] args) {
		// Unit 이라는 배열에 저글링, 질럿, 마린을 담아보자
		// 실행도 시켜봐라
		
		Unit unit1 = new Zealot("질럿");
		Unit unit2 = new Marine("마린");
		Unit unit3 = new Zergling("저글링");
		
		Unit[] arrayUnits = new Unit[12];
		
		arrayUnits[0] = unit1;
		arrayUnits[1] = unit2;
		arrayUnits[2] = unit3;

	}// end main
}// end class
