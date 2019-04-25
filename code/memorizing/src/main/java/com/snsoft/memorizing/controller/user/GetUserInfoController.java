package com.snsoft.memorizing.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.bean.user.GetUserInfoBean;
import com.snsoft.memorizing.service.user.GetUserInfoService;
import com.snsoft.memorizing.utils.AllConstant;
import com.snsoft.memorizing.utils.JsonUtil;

/**
 * 
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月24日下午9:09:51
 * 
 * @Description TODO 获取个人信息接口 Controller
 */
@RestController
public class GetUserInfoController {
	@Autowired
	GetUserInfoService service;

	@GetMapping("getUserInfo")
	public String getUserInfo(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			GetUserInfoBean userInfo = service.getUserInfo(session.getAttribute("loginmark").toString());
			if(userInfo == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "获取失败");
			}else {
				result = JsonUtil.jsonResponse(userInfo, AllConstant.CODE_SUCCESS, "获取成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}

}
