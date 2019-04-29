package com.snsoft.memorizing.controller.manager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.bean.user.GetUserInfoBean;
import com.snsoft.memorizing.service.manager.GetAllUserService;
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
 * @date 2019年4月28日下午6:45:48
 * 
 * @Description TODO 获取所有用户接口Controller
 */
@RestController
public class GetAllUserController {
	@Autowired
	GetAllUserService service;

	@GetMapping("getAllUser")
	public String getAllUser(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {

			List<GetUserInfoBean> list = service.getAllUser(session.getAttribute("loginmark").toString());
			if (list == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "获取用户失败");
			} else {
				result = JsonUtil.jsonResponse(list, AllConstant.CODE_ERROR, "获取用户成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
