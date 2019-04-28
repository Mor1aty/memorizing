package com.snsoft.memorizing.controller.manager;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.service.manager.SetAchievementService;
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
 * @date 2019年4月28日下午8:21:44
 * 
 * @Description TODO 设置成就接口Controller
 */
@RestController
public class SetAchievementController {
	@Autowired
	SetAchievementService service;

	@PostMapping("setAchievement")
	public String setAchievement(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "content" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}
			int i = service.setAchievement(session.getAttribute("loginmark").toString(), params.get("content"));
			if (i < 0) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "设置失败");
			} else {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "设置成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
