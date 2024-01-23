package ch02;

// GalaxyPhone
// 제조사: (maker - String)
// 모델명: (modelName - String)
// 소유자: (owner - String)
// 전화번호: (telNumber - String)
// 전원상태: (power - boolean)

// 전원버튼누름: onPower - power 상태를 부정
// 전화걸기: call - power가 true일 때 "(상대 전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기: emergency - "112로 전화를 겁니다." 출력
// 휴대전화정보보기: getInfomation - power가 true일 때  

// ===== (전화번호) =====
// 제조사: (제조사)
// 모델명: (모델명)
// 소유자: (소유자)
//
// 출력

class GalaxyPhone {
	
	String maker;
	String modelName;
	String owner;
	String telNumber;
	boolean power;
	
	void onPower () {
		power = !power;
	}
	
	void call (String toTelNumber) {
		if(!power) return;									// 비정상인 경우에 부정으로 ! 만들고 return; 처리하기	
		System.out.println(toTelNumber + "로 전화를 겁니다."); // 특정 조건에서만 기능할 때 if 사용
	}
	
	void emergency () {
		System.out.println("112로 전화를 겁니다.");
	}
	
	void getInfomation () {
		if(!power) return; 								   // 비정상인 경우에 부정으로 ! 만들고 return; 처리하기					
		System.out.println("=====" + telNumber + "====="); // 특정 조건에서만 기능할 때 if 사용
		System.out.println("제조사: " + maker);
		System.out.println("모델명: " + modelName); 
		System.out.println("소유자: " + owner);
	}
}

public class A_Example {

	public static void main(String[] args) {
		GalaxyPhone s23 = new GalaxyPhone(); // 인스턴스 생성하는 구문 (new 클래스명)
		GalaxyPhone s24 = new GalaxyPhone();
		
		s23.maker="SAMSUNG";
		s23.modelName="s23";
		s23.owner="홍길동";
		s23.telNumber="010-1234-5678";
		s23.power=false;
		
		s24.maker="SAMSUNG";
		s24.modelName="s24";
		s24.owner="김철수";
		s24.telNumber="010-5678-1234";
		s24.power=false;
		
		s23.onPower();
		s23.getInfomation();
		
		s23.emergency();
		s24.emergency();
	}

}