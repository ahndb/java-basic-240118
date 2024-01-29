package ch03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
		System.out.println(arrayList);
		// LinkedList: 이중 연결 기법을 사용하여 추가, 삭제가 빠름
			// arrayList = new LinkedList<>();
		
		// add(): List 에 요소를 추가
		// 추가할 요소의 데이터 타입은 반드시 제너릭으로 지정한 타입으로만 지정 가능
		arrayList.add(10);
//		arrayList.add("aaaa"); // Object로 지정시 가능 List<Object>
		System.out.println(arrayList);
		
		// get(): List 의 특정 인덱스 요소에 접근
		// List 인덱스 범위를 초과하는 인덱스를 지정할 수 없음
		// 기본형 데이터 타입의 변수로 반환값을 받을 경우 null 값을 받을 수 있음을 주의
		int arrayElement = arrayList.get(0); // 참조형 데이터 타입은 null을 받을 수 있음
		System.out.println(arrayElement);
		
		arrayList.add(20);
		arrayList.add(30);
		
		System.out.println(arrayList);
		
		// set(): List 의 특정 인덱스 요소를 변경
		// List 인덱스 범위를 초과하는 인덱스를 지정할 수 없음
		arrayList.set(0, 50);
		System.out.println(arrayList);
		
		// remove(): List 의 특정 요소를 삭제
		arrayList.remove(0);
		System.out.println(arrayList);
		
		// size(): List 의 길이를 반환
		System.out.println(arrayList.size());
		
		// Set: 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않음 (집합)
		Set<String> set;
		// HashSet: 해싱 기법을 사용해서 검색 속도가 빠름
		// set = new HashSet<>();
		// TreeSet: 요소를 정렬해서 추가 
		 set = new TreeSet<>();
		
		// add(): Set 에 요소를 추가. 단, 동일한 요소가 이미 추가되어있다면 추가하지 않음
		set.add("Apple");
		System.out.println(set);
		set.add("Banana1");
		System.out.println(set);
		set.add("Banana"); 
		System.out.println(set);
		
		// remove(): Set 에서 특정 요소를 제거
		// 제거하고자 하는 요소가 없더라도 예외가 발생하지 않음
		set.remove("Apple");
		System.out.println(set);
		
		// contains(): Set 에서 특정 요소가 존재하는지 확인
		System.out.println(set.contains("Banana"));
		
	}

}
