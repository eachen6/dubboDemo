package com.provider.service.impl;

import org.springframework.stereotype.Service;

import com.api.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Override
	public int getInfoCount() {
		// TODO Auto-generated method stub
		return 1996;
	}

}
