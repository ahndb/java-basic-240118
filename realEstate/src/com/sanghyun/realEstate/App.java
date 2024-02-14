package com.sanghyun.realEstate;

import java.util.Scanner;

import com.sanghyun.realEstate.controller.AuthController;
import com.sanghyun.realEstate.controller.implement.AuthControllerImplement;
import com.sanghyun.realEstate.dto.request.CheckIdRequestDto;
import com.sanghyun.realEstate.dto.response.CheckIdResponseDto;
import com.sanghyun.realEstate.interfaces.Code;

// Controller (package / interface) : 입력과 출력을 담당하는 요소
// Service (package / interface) : 실제 비지니스 로직 (연산)
// Repository (package / interface) : 데이터베이스 연결과 관련된 작업

// DTO (Data Transfer Object) : 데이터 전송을 위한 객체
// Entity : 데이터베이스의 테이블을 자바 클래스로 표현한 객체

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		AuthController authController = new AuthControllerImplement();
		
		while (true) {
			System.out.print("1. 회원가입 / 2. 로그인 / 3. 게시물 작성 / 4. 게시물 보기 / 5. 종료 : ");
			String input = scanner.nextLine();
			
			if (input.equals("1")) {
				// 1. 아이디 중복 확인
				CheckIdRequestDto checkIdRequest = new CheckIdRequestDto();
				System.out.print("아이디 : ");
				String id = scanner.nextLine();
				checkIdRequest.setId(id);
				
				CheckIdResponseDto checkIdResponse = authController.checkId(checkIdRequest);
				Code code = checkIdResponse.getCode();
				
				if (code == Code.DI) {
					System.out.println("중복된 아이디입니다.");
					continue;
				}
				
				if (code == Code.DBE) {
					System.out.println("데이터베이스 에러입니다.");
					continue;
				}
				
				
				
				// 2. 이메일 인증 코드 전송
				// 3. 이메일 인증 처리
				// 4. 회원가입 처리
			}
			if (input.equals("2")) System.out.println("로그인"); 
			if (input.equals("3")) System.out.println("게시물 작성"); 
			if (input.equals("4")) System.out.println("게시물 보기"); 
			if (input.equals("5")) break; 
		}
		
		System.out.println("프로그램 종료");
		
	}

}

// 아이디 중복 확인
// 입력: 아이디 (request)
// 출력: (response)

// 성공
// 실패
//- 중복된 아이디
//- 데이터베이스 에러

// 프로세스:
//- user 테이블에서 입력받은 아이디로 조회한 결과가 존재하면 중복, 존재하지 않으면 사용가능













