package com.snsoft.memorizing.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.bean.task.GetTaskInfoBean;
import com.snsoft.memorizing.service.user.GetHistoryService;
import com.snsoft.memorizing.utils.AllConstant;
import com.snsoft.memorizing.utils.JsonUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月27日下午3:32:42
 * 
 * @Description TODO 获取历史任务接口Controller
 */
@RestController
public class GetHistoryController {
	@Autowired
	GetHistoryService service;

	@GetMapping("getHistory")
	public String getHistory(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			List<GetTaskInfoBean> taskInfo = service.getHistory(session.getAttribute("loginmark").toString());
//			if (taskInfo == null) {
//				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "获取失败了");
			// }
//				else {
//			List list=new ArrayList();
//			list.add(taskInfo.getId());
//			list.add(taskInfo.getIsUse());
//			list.add(taskInfo.getContent());
//			list.add(taskInfo.getFile());
//			list.add(taskInfo.getGmtCreate());
//			list.add(taskInfo.getGmtEnd());
			if (taskInfo == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "获取失败");
			} else {
				result = JsonUtil.jsonResponse(taskInfo, AllConstant.CODE_SUCCESS, "获取成功");
			}
			// }
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}

}
