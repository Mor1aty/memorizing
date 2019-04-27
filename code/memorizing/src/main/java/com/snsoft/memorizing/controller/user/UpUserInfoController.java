package com.snsoft.memorizing.controller.user;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.service.user.UpUserInfoService;
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
 * @date 2019年4月27日上午11:44:09
 * 
 * @Description TODO 设置个人信息接口Controller
 */
@RestController
public class UpUserInfoController {
	@Autowired
	UpUserInfoService service;

	@PostMapping("upUserInfo")
	public String upUserInfo(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "nickname", "gender", "age", "account" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}
			int i = service.upUserInfoService(params.get("nickname"), Integer.parseInt(params.get("gender")),
					Integer.parseInt(params.get("age")), session.getAttribute("loginmark").toString());

			if (i > 0) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "设置成功");
			} else {

				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "设置失败");
			}

		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}

}