package com.sanghyun.realEstate.controller;

import com.sanghyun.realEstate.dto.request.CheckIdRequestDto;
import com.sanghyun.realEstate.dto.response.CheckIdResponseDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckIdRequestDto request);
}
