package ch12;

public class MainTest {
	public static void main(String[] args) {
		
		// 코드를 좀 더 유연하고 확장성 있게 설계할 때 표준, 규약, 규칙을 지켜서 설계하고 싶다면
		// 인터페이스 활용
		HomeAppliances appliances1 = new Television();
		HomeAppliances appliances2 = new Refrigerator();
//		HomeAppliances appliances3 = new ToyRobot(); --> 데이터 타입이 다름
		
		Remotecontroller controller1 = new Television();
		Remotecontroller controller2 = new Refrigerator();
		Remotecontroller controller3 = new ToyRobot();
		
		Remotecontroller[] remotecontrollers = new Remotecontroller[3];
		
		remotecontrollers[0] = new Television();
		remotecontrollers[1] = new Refrigerator();
		remotecontrollers[2] = new ToyRobot();

		for(int i = 0; i < remotecontrollers.length; i++) {
			remotecontrollers[i].turnOn();
		}
		
		System.out.println("-------------------------------------------");
		
		for(int i = 0; i < remotecontrollers.length; i++) {
			remotecontrollers[i].turnOff();
		}
		
	} // end main
} // end class
