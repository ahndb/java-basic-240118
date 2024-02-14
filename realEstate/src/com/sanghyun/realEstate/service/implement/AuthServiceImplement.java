package com.sanghyun.realEstate.service.implement;

import java.util.Random;

import com.sanghyun.realEstate.dto.request.CheckIdRequestDto;
import com.sanghyun.realEstate.dto.request.SendCodeRequestDto;
import com.sanghyun.realEstate.dto.response.CheckIdResponseDto;
import com.sanghyun.realEstate.dto.response.SendCodeResponseDto;
import com.sanghyun.realEstate.interfaces.Code;
import com.sanghyun.realEstate.repository.EmailAuthenticationRepository;
import com.sanghyun.realEstate.repository.UserRepository;
import com.sanghyun.realEstate.service.AuthService;

public class AuthServiceImplement implements AuthService { // 매개변수 받아오고 실제 처리 함
	
	private UserRepository userRepository;
	private EmailAuthenticationRepository emailAuthenticationRepository;
	
	public AuthServiceImplement (
			UserRepository userRepository,
			EmailAuthenticationRepository emailAuthenticationRepository
	) {
		this.userRepository = userRepository; // 생성자로 의존성을 주입하기
		this.emailAuthenticationRepository = emailAuthenticationRepository;
	}

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto dto) {
		
		CheckIdResponseDto result = new CheckIdResponseDto();
		
		try {
			
			String id = dto.getId();
			
			boolean existedId = userRepository.existsById(id);
			
			if (existedId) result.setCode(Code.DI);
			else result.setCode(Code.SU);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			result.setCode(Code.DBE);
		}
		
		return result;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto dto) {
		
		SendCodeResponseDto result = new SendCodeResponseDto();
		
		try {
			
			String email = dto.getEmail();
			String authenticationCode = randomString();
			
			boolean existedEmail = emailAuthenticationRepository.existsByEmail(email);
			if (existedEmail) {
				result.setCode(Code.DE);
				return result;
			}
			
			emailAuthenticationRepository.save(email, authenticationCode);
			result.setCode(Code.SU);
			result.setData(authenticationCode);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			result.setCode(Code.DBE);
		}
		
		return result;
	}
	
	private String randomString() {
		
		char[] randomString = new char[4];
		
		Random random = new Random();
		
		for (int index = 0; index < 4; index++) {
			randomString[index] = (char) (random.nextInt(26) + 65);
		}
		
		return new String(randomString);
		
	}
	
}










