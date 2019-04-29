package com.snsoft.memorizing.controller.task;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.bean.task.GetTaskSectorInfoBean;
import com.snsoft.memorizing.service.task.GetTaskService;
import com.snsoft.memorizing.utils.AllConstant;
import com.snsoft.memorizing.utils.HttpUtil;
import com.snsoft.memorizing.utils.JsonUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日上午9:24:47
 * 
 * @Description TODO 获取任务详细接口Controller
 */
@RestController
public class GetTaskController {
	@Autowired
	GetTaskService service;

	@GetMapping("getTask")
	public String getTask(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "id" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}
			GetTaskSectorInfoBean list = service.getTask(Integer.parseInt(params.get("id")));
			if (list == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "获取失败");
			} else {
				result = JsonUtil.jsonResponse(list, AllConstant.CODE_SUCCESS, "获取成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
