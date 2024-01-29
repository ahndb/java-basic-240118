package ch03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class B_Package {

	public static void main(String[] args) {
		
		// Wrapper 클래스: 기본형 데이터 타입을 참조형 데이터 타입으로 다룰 수 잇도록 하는 클래스
		// 일반적으로 기본형 데이터타입의 풀네임에 첫글자를 대문자로 지정하면 Wrapper 클래스가 됨
		Integer wrapperInt = 10;
		Double wrapperDouble = 10.0;
		Boolean wrapperBoolean = false;
		String wrapperString = "String";
		
		// 자주 사용하는 기능
		// parse 메서드: 문자열을 특정 타입으로 변환
		int number = Integer.parseInt("123");
		// toString 메서드: 특정 타입의 값을 문자열로 변환
		String string = Integer.toString(123);
		
		// Collection Framework: java 에서 데이터구조에 대한 표준화된 기법을 제공
		
		// List: 데이터를 저장할 때 중복을 허용하고 '순서'가 존재 함
		List<Integer> arrayList; // int[] arrayList;
		// *ArrayList: List 중에서 내부 배열을 사용하여 인덱스를 사용한 검색이 빠름
		arrayList = new ArrayList<>();
		// LinkedList: 이중 연결 기법을 사용하여 추가, 삭제가 빠름
			// arrayList = new LinkedList<>();
		
		// add(): List 에 요소를 추가
		// 추가할 요소의 데이터 타입은 반드시 제너릭으로 지정한 타입으로만 지정 가능
		arrayList.add(null);
//		arrayList.add("aaaa"); Object로 지정시 가능 List<Object>
		
		// get(): List 의 특정 인덱스 요소에 접근
		// List 인덱스 범위를 초과하는 인덱스를 지정할 수 없음
		// 기본형 데이터타입의 변수로 반환값을 받을 경우 null 값을 받을 수 있음을 주의
		Integer arrayElement = arrayList.get(0); // 참조형 데이터 타입은 null을 받을 수 있음
		
		
		
		
		
		
		
		
	//	Tree 정렬이 된다
	}

}
