package com.sanghyun.realEstate.controller.implement;

import com.sanghyun.realEstate.controller.AuthController;
import com.sanghyun.realEstate.dto.request.CheckIdRequestDto;
import com.sanghyun.realEstate.dto.response.CheckIdResponseDto;
import com.sanghyun.realEstate.service.AuthService;
import com.sanghyun.realEstate.service.implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService = new AuthServiceImplement();

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto request) {
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

}
