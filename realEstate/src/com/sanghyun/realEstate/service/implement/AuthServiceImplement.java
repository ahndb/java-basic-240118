package com.sanghyun.realEstate.service.implement;

import com.sanghyun.realEstate.dto.request.CheckIdRequestDto;
import com.sanghyun.realEstate.dto.response.CheckIdResponseDto;
import com.sanghyun.realEstate.interfaces.Code;
import com.sanghyun.realEstate.service.AuthService;

public class AuthServiceImplement implements AuthService {

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto dto) {
		
		CheckIdResponseDto result = new CheckIdResponseDto();
		
		try {
			
			String id = dto.getId();
			
			boolean existedId;
			
			if (existedId) result.setCode(Code.DI);
			else result.setCode(Code.SU);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			result.setCode(Code.DBE);
		}
		
		return result;
	}

}
