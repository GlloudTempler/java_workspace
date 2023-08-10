package ch09;

public class StringTest1 {
	
	public static void main(String[] args) {
		
		// String - 문자열이라는 데이터를 보관, 연산 사용
		// static 영역, 데이터 영역 ----- 상수 풀 영역
		
		String str1 = "반갑다";
		String str2 = new String("반갑다");
		String str3 = "반갑다";
		System.out.println(str1);
		System.out.println(str2);
		
		//시나리오1
		if(str1 == str2) {
			System.out.println("주소가 같다");
		} else {
			System.out.println("주소가 다르다");
		}
		
		// 시나리오2
		// 리터럴 방식으로 생성한 문자열은 이미 생성한 값과 같다면 새로 만들지 않고 재활용
		if(str1 == str3) {
			System.out.println("주소가 같다");
		} else {
			System.out.println("주소가 다르다");
		}
		
		// 시나리오3
		System.out.println("===================");
		str3 = "반갑습니다.";
		if(str1 == str3) {
			System.out.println("주소 같음");
		} else {
			System.out.println("주소 다름");
		}
		
		// 시나리오4
		// 문자열의 값을 비교하려면 equals를 반드시 사용하시오
		System.out.println("===================");
		if(str1.equals(str2)) {
			System.out.println("같은 값이다.");
		} else {
			System.out.println("다른 값이다.");
		}
		
	}// end main
}// end class
