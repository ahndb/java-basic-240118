package ch01;

public class B_Datatype {

	public static void main(String[] args) {
		
		// 기본형 데이터 타입
		
		// 정수형 데이터 타입: 실수부가 없는 정수를 나타냄
		// byte: 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		// -128 ~ 127
		byte byte1 = 127;
		// byte byte2 = 128;
		
		// short: 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32768 ~ 32767
		short short1 = 32767;
		// short short1 = 32768;
		
		// int: 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		// -2147483648 ~ 2147483647
		// 숫자가 클때 _로 잘라서 표기 가능
		int int1 = 2_147_483_647;
		// int int1 = 2_147_483_648;
		
		// long: 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		long long1 = 2_147_483_648L;
		
		// 실수형 데이터 타입: 실수부를 가지는 데이터 타입
		// float: 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 6~7자리에서 오차가 발생 
		float float1 = 3.1415926535F;
		System.out.println(float1);
		
		// double: 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 15~17 자리에서 오차가 발생
		double double1 = 3.1415926535;
		System.out.println(double1);
		
		// 문자형 데이터 타입: 문자 하나를 저장할 수 있는 데이터 타입
		// char: 2byte(16bit)의 크기를 가지는 문자형 데이터 타입
		// 0 ~ 65535
		char char1 = 'a';
		char char2 = 97;
		System.out.println(char1);
		System.out.println(char2);
		
		// 논리형 데이터 타입: 참과 거짓 값을 가자 데이터 타입
		// boolean: 1byte(8bit)의 크기를 가지는 논리형 데이터 타입
		// true, false
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
