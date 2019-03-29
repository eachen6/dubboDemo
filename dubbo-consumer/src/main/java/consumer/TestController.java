package consumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.common.ServerResponse;
import com.api.pojo.Info;
import com.api.service.InfoService;

@Controller
public class TestController {
	
	@Autowired 
	InfoService infoService;
	
	/**
	 * 增加信息
	 * @param info
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/addinfo", method = RequestMethod.POST)
	public ServerResponse addInfo(Info info) {
		return infoService.addInfo(info);
	}
	
	/**
	 * 根据id删除用户信息
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/deleteinfo", method = RequestMethod.POST)
	public ServerResponse deleteInfo(@RequestParam(value = "id") int id) {
		return infoService.deleteInfo(id);
	}
	
	/**
	 * 获取所有用户信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/getinfolist", method = RequestMethod.GET)
	public ServerResponse getInfoList() {
		return infoService.getInfoList();
	}
	
	/**
	 * 根据id返回对应用户信息
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/info/{id}", method = RequestMethod.GET)
	public ServerResponse getMyInfo(@PathVariable(value = "id") int id ) {
		return infoService.getMyInfo(id);
	}
	
	/**
	 * 更新用户信息
	 * @param info
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/updateinfo", method = RequestMethod.POST)
	public ServerResponse UpdateMyInfo(@RequestBody Info info) {
		return infoService.updateInfo(info);
	}
}
