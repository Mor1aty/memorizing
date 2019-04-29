package com.snsoft.memorizing.controller.task;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.bean.task.GetCurrentBlankInfoBean;
import com.snsoft.memorizing.service.task.GetCurrentBlankService;
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
 * @date 2019年4月28日下午2:56:46
 * 
 * @Description TODO 获取当前任务填空题接口Controller
 */
@RestController
public class GetCurrentBlankController {
	@Autowired
	GetCurrentBlankService service;

	@GetMapping("getCurrentBlank")
	public String getCurrentBlank(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "task_stage" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}

			List<GetCurrentBlankInfoBean> list = service.getCurrentBlank(Integer.parseInt(params.get("task_stage")),session.getAttribute("loginmark").toString());

			result = JsonUtil.jsonResponse(list, AllConstant.CODE_SUCCESS, "获取成功");
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
