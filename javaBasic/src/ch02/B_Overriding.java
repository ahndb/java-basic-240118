package ch02;

// 오버라이딩: 하위 클래스에서 상위 클래스의 메서드를 재정의 하는 것
// 규칙
// 1. 상위 클래스에서 선언된 메서드와 메서드 이름, 매개변수의 조합이 같아야 함
// 2. 상위 클래스에서 선언된 메서드가 final로 선언되면 재정의가 불가능
// 3. 상위 클래스에서 선언된 메서드보다 더 좁은 범위의 접근 제어를 할 수 없음

class SuperClass1 {
	int superInstanceVariable;
	
	void instanceMethod () {
		System.out.println("조상 클래스의 메서드입니다.");
	}
}

class SubClass1 extends SuperClass1 {
	
//	void instanceMethod () {
//		System.out.println("SubClass1의 인스턴스 메서드입니다.");
//	}
	
}

class SubClass2 extends SuperClass1 {
	
	void instanceMethod () {
		System.out.println("SubClass2의 인스턴스 메서드입니다.");
	}
	
}

public class B_Overriding {

	public static void main(String[] args) {
		
		SuperClass1 instance1 = new SuperClass1();
		SubClass1 instance2 = new SubClass1();
		SubClass2 instance3 = new SubClass2();
		
		instance1.instanceMethod();
		instance2.instanceMethod();
		instance3.instanceMethod();

	}

}
