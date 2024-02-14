package com.sanghyun.realEstate.service;

import com.sanghyun.realEstate.dto.request.CheckIdRequestDto;
import com.sanghyun.realEstate.dto.response.CheckIdResponseDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckIdRequestDto dto);
}
