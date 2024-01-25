package ch02.review;

public class A_Instance {

	public static void main(String[] args) {
		
		// 객체(인스턴스): 클래스에 정의된 대로 만들어진 독립적인 실체
		// 클래스로 '생성'하는 작업이 이루어짐
		// new 연산자를 사용하여 생성 - new 클래스명();
		ExampleClass instance = new ExampleClass();
		//         변수선언           인스턴스 생성
		
		int number;				// 변수선언
		ExampleClass example;	// 변수선언
		
		
		
		// 인스턴스의 변수와 메서드 접근: 인스턴스.변수 / 인스턴스.메서드();
		//							(접근한다)	  (호출한다)
		instance.instanceVariable = 0;
		instance.instanceMethod();
		
		new ExampleClass().instanceVariable = 0; // 가능은 하나 저장되는 공간이 없음.
		
		// 참조)) 아래 코드는 인스턴스가 복사된 것이 아니라 인스턴스의 주소가 복사되어 할당 되는것
		ExampleClass anotherInstance = instance;
		
	}

}
