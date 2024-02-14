package com.sanghyun.realEstate.service.implement;

import com.sanghyun.realEstate.dto.request.CheckIdRequestDto;
import com.sanghyun.realEstate.dto.response.CheckIdResponseDto;
import com.sanghyun.realEstate.interfaces.Code;
import com.sanghyun.realEstate.repository.UserRepository;
import com.sanghyun.realEstate.repository.implement.UserRepositoryImplement;
import com.sanghyun.realEstate.service.AuthService;

public class AuthServiceImplement implements AuthService { // 매개변수 받아오고 실제 처리 함
	
	private UserRepository userRepository;
	
	public AuthServiceImplement (UserRepository userRepository) {
		this.userRepository = userRepository; // 생성자로 의존성을 주입하기
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

}
