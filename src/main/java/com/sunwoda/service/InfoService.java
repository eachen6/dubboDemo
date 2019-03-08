package com.sunwoda.service;

import com.sunwoda.common.ServerResponse;
import com.sunwoda.pojo.Info;

public interface InfoService {
	ServerResponse addInfo(Info info);
	
	ServerResponse deleteInfo(int id);
	
	ServerResponse getInfoList();
	
	ServerResponse updateInfo(Info info);
	
	ServerResponse getMyInfo(int id);
}
