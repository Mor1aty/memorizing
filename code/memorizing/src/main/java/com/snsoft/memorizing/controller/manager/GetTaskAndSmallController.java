package com.snsoft.memorizing.controller.manager;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.bean.manager.GetTaskAndSmallInfoBean;
import com.snsoft.memorizing.service.manager.GetTaskAndSmallService;
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
 * @date 2019年4月28日下午7:48:30
 * 
 * @Description TODO 获取用户当前计划及子计划接口Controller
 */
@RestController
public class GetTaskAndSmallController {
	@Autowired
	GetTaskAndSmallService service;

	@GetMapping("getTaskAndSmall")
	public String getTask(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "user_account" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}
			GetTaskAndSmallInfoBean list = service.getTask(session.getAttribute("loginmark").toString(),
					params.get("user_account"));
			if (list == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "获取计划失败");
			} else {
				result = JsonUtil.jsonResponse(list, AllConstant.CODE_SUCCESS, "获取计划成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
