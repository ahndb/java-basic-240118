package ch02.review;

class OverloadClass {
	
	// 오버로딩: '하나의 클래스 내부'에서 같은 이름의 메서드를 여러 개 가질수 있도록 하는 것
	// 조건:
	// 1. 메서드의 이름이 같아야 함
	// 2. 매개변수의 조합(타입, 개수, 타입의 순서)이 달라야 함 
	// 3. 반환타입과 매개변수의 이름은 오버로딩에 영향을 주지 않음
	
	// 장점:
	// 1. 코드의 일관성과 가독성을 향상
	// 2. 다형성 지원으로 코드의 확장성을 향상
	void method () {}

	void method (int arg) {}

	void method (double arg) {}

	void method (int arg1, double arg2) {}

	void method (double arg1, int arg2) {}
	
	// int method () {} - 반환타입이 다른 경우 불가능
	// void method (int parameter) {} - 매개변수 이름은 영향을 주지 않음
	
	
	
	
	
	
	
}

public class A_Overloading {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
