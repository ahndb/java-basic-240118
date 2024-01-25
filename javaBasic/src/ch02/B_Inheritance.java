package ch02;

// 상속: 객체지향 프로그래밍의 특성 중 하나
// 원래 존재하던 클래스를 확장하여 재사용할 수 있도록 하는 것
// 코드 중복을 제거하고 확장성을 높일 수 있음
class Teacher {
	String name;
	int age;
	
	String course;
	
	void sleep () {
		System.out.println(name + "가 잠을 잡니다.");
	}
	
	void teach () {
		System.out.println(name + "가" + course + "를 가르칩니다.");
	}
}

class Devloper {
	String name;
	int age;
	String position;
	
	void sleep () {
		System.out.println(name + "가 잠을 잡니다.");
	}
	
	void develop () {
		System.out.println(neme + "가 " + position + " 개발을 합니다.");
	}
	
}


public class B_Inheritance {

	public static void main(String[] args) {
		

	}

}
