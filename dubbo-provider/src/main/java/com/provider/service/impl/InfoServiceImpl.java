package com.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.common.ServerResponse;
import com.api.pojo.Info;
import com.api.service.InfoService;
import com.provider.dao.InfoMapper;

@Service("infoService")
public class InfoServiceImpl implements InfoService {

	@Autowired
	InfoMapper infoMapper;
	
	@Override
	public ServerResponse addInfo(Info info) {
		int res = infoMapper.insert(info);
		if(res > 0) {
			return ServerResponse.createBySuccessMessage("��ӳɹ�");
		}
		return ServerResponse.createByErrorMessage("���ʧ��");
	}

	@Override
	public ServerResponse deleteInfo(int id) {
		int res = infoMapper.deleteByPrimaryKey(id);
		if(res > 0) {
			ServerResponse.createBySuccessMessage("��ɾ��");
		}
		return ServerResponse.createByErrorMessage("ɾ��ʧ��");
	}

	@Override
	public ServerResponse getInfoList() {
		//System.out.println("-------------------------------");
		List<Info> infolists = infoMapper.getInfoList();
		//System.out.println(infolists+"++++++++++++++++++++++++++");
		if(infolists.size() > 0) {
			return ServerResponse.createBySuccess("��ѯ�ɹ�", infolists);
		}
		return ServerResponse.createByErrorMessage("��ϢΪ��");
	}

	@Override
	public ServerResponse updateInfo(Info info) {
		int res = infoMapper.updateByPrimaryKeySelective(info);
		if (res > 0) {
			return ServerResponse.createBySuccessMessage("���³ɹ�");
		}
		return ServerResponse.createByErrorMessage("����ʧ��");
	}

	@Override
	public ServerResponse getMyInfo(int id) {
		Info info = infoMapper.selectByPrimaryKey(id);
		if(info != null) {
			return ServerResponse.createBySuccess("��ѯ�ɹ�", info);
		}
		return ServerResponse.createByErrorMessage("��ѯʧ�ܣ����û���Ϣ������");
	}
	
}
