package com.snsoft.memorizing.controller.user;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.service.user.LoginService;
import com.snsoft.memorizing.utils.AllConstant;
import com.snsoft.memorizing.utils.HttpUtil;
import com.snsoft.memorizing.utils.JsonUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年4月8日下午4:25:05
 * 
 * @Description TODO 
 *	登录接口 Controller
 */
@RestController
public class LoginController {
	@Autowired
	LoginService service;

	@PostMapping("login")
	public String login(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "account", "pwd", "type" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}
			int i = service.login(Integer.parseInt(params.get("type")), params.get("account"), params.get("pwd"));
			if (i > 0) {
				session.setAttribute("loginmark", params.get("account").toString());
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "登陆成功");
			} else {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "用户名密码错误");
			}

		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
