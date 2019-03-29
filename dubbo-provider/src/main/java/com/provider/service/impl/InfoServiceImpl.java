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
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		return ServerResponse.createByErrorMessage("添加失败");
	}

	@Override
	public ServerResponse deleteInfo(int id) {
		int res = infoMapper.deleteByPrimaryKey(id);
		if(res > 0) {
			ServerResponse.createBySuccessMessage("已删除");
		}
		return ServerResponse.createByErrorMessage("删除失败");
	}

	@Override
	public ServerResponse getInfoList() {
		//System.out.println("-------------------------------");
		List<Info> infolists = infoMapper.getInfoList();
		//System.out.println(infolists+"++++++++++++++++++++++++++");
		if(infolists.size() > 0) {
			return ServerResponse.createBySuccess("查询成功", infolists);
		}
		return ServerResponse.createByErrorMessage("信息为空");
	}

	@Override
	public ServerResponse updateInfo(Info info) {
		int res = infoMapper.updateByPrimaryKeySelective(info);
		if (res > 0) {
			return ServerResponse.createBySuccessMessage("更新成功");
		}
		return ServerResponse.createByErrorMessage("更新失败");
	}

	@Override
	public ServerResponse getMyInfo(int id) {
		Info info = infoMapper.selectByPrimaryKey(id);
		if(info != null) {
			return ServerResponse.createBySuccess("查询成功", info);
		}
		return ServerResponse.createByErrorMessage("查询失败，该用户信息不存在");
	}
	
}
