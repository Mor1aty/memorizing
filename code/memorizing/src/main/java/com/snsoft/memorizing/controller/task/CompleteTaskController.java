package com.snsoft.memorizing.controller.task;
/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午4:25:54
 * 
 * @Description TODO 
 * 完成当前任务接口Controller
 */

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.service.task.CompleteTaskService;
import com.snsoft.memorizing.utils.AllConstant;
import com.snsoft.memorizing.utils.HttpUtil;
import com.snsoft.memorizing.utils.JsonUtil;

@RestController
public class CompleteTaskController {
	@Autowired
	CompleteTaskService service;

	@PostMapping("completeTask")
	public String completeTask(HttpServletRequest request, HttpSession session) {
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

			int i = service.completeTask(Integer.parseInt(params.get("id")));
			if (i > 0) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "当前任务完成");
			} else {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "未完成任务");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
