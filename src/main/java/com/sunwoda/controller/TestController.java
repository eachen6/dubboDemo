package com.sunwoda.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunwoda.common.ServerResponse;
import com.sunwoda.pojo.Info;
import com.sunwoda.service.InfoService;

@Controller
public class TestController {
	
	@Autowired InfoService infoService;
	
	/**
	 * ������Ϣ
	 * @param info
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/addinfo", method = RequestMethod.POST)
	public ServerResponse addInfo(Info info) {
		return infoService.addInfo(info);
	}
	
	/**
	 * ����idɾ���û���Ϣ
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/deleteinfo", method = RequestMethod.POST)
	public ServerResponse deleteInfo(@RequestParam(value = "id") int id) {
		return infoService.deleteInfo(id);
	}
	
	/**
	 * ��ȡ�����û���Ϣ
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getinfolist", method = RequestMethod.GET)
	public ServerResponse getInfoList() {
		return infoService.getInfoList();
	}
	
	/**
	 * ����id���ض�Ӧ�û���Ϣ
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/info/{id}", method = RequestMethod.GET)
	public ServerResponse getMyInfo(@PathVariable(value = "id") int id ) {
		return infoService.getMyInfo(id);
	}
	
	/**
	 * �����û���Ϣ
	 * @param info
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/updateinfo", method = RequestMethod.POST)
	public ServerResponse UpdateMyInfo(@RequestBody Info info) {
		return infoService.updateInfo(info);
	}
}
