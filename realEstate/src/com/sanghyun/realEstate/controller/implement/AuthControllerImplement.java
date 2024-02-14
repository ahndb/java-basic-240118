package com.sanghyun.realEstate.controller.implement;

import com.sanghyun.realEstate.controller.AuthController;
import com.sanghyun.realEstate.dto.request.CheckIdRequestDto;
import com.sanghyun.realEstate.dto.request.SendCodeRequestDto;
import com.sanghyun.realEstate.dto.response.CheckIdResponseDto;
import com.sanghyun.realEstate.dto.response.SendCodeResponseDto;
import com.sanghyun.realEstate.interfaces.Code;
import com.sanghyun.realEstate.service.AuthService;
import com.sanghyun.realEstate.service.implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService; // 생성자로 의존성을 주입하기
	}

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto request) {
		boolean validId = request.validId();
		if (!validId) return new CheckIdResponseDto(Code.VF, null);
		
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEmail();
		if (!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
		return response;
	}

}
