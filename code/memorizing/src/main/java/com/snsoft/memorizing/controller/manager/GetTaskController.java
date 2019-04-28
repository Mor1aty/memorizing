package com.snsoft.memorizing.controller.manager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.service.manager.GetTaskService;
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
 * @date 2019年4月28日下午7:48:30
 * 
 * @Description TODO 获取用户当前计划及子计划接口Controller
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

			List list = service.getTask(session.getAttribute("loginmark").toString());
			if (list == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "获取计划失败");
			} else {
				result = JsonUtil.jsonResponse(list, AllConstant.CODE_ERROR, "获取计划成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
