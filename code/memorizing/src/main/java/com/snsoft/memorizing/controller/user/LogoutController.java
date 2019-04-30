package com.snsoft.memorizing.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
 * @date 2019年4月27日上午9:07:26
 * 
 * @Description TODO 注销接口Controller
 */
@RestController
public class LogoutController {

	@GetMapping("logout")
	public String logout(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			String account = (String) session.getAttribute("loginmark".toString());

			if (account == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "注销失败");
			} else {
				session.removeAttribute("loginmark");
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "注销成功");
			}

		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
