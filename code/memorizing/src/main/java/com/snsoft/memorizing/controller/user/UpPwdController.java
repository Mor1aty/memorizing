package com.snsoft.memorizing.controller.user;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.service.user.UpPwdService;
import com.snsoft.memorizing.utils.AllConstant;
import com.snsoft.memorizing.utils.HttpUtil;
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
 * @date 2019年4月27日下午12:31:39
 * 
 * @Description TODO 修改密码接口Controller
 */
@RestController
public class UpPwdController {
	@Autowired
	UpPwdService service;

	@PostMapping("upPwd")
	public String upPwd(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "oldPwd", "newPwd" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}
			int i = service.upPwdMapper(session.getAttribute("loginmark").toString(), params.get("oldPwd"),
					params.get("newPwd"));
			if (i > 0) {

				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "修改成功");
			} else {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "修改错误");
			}

		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
