package com.api.service;

import com.api.common.ServerResponse;
import com.api.pojo.Info;

public interface InfoService {
	ServerResponse addInfo(Info info);
	
	ServerResponse deleteInfo(int id);
	
	ServerResponse getInfoList();
	
	ServerResponse updateInfo(Info info);
	
	ServerResponse getMyInfo(int id);
}
