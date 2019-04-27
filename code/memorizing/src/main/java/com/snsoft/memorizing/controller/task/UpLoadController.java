package com.snsoft.memorizing.controller.task;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.service.task.UpLoadService;
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
 * @date 2019年4月27日下午8:08:29
 * 
 * @Description TODO 上传接口Controller
 */
@RestController
public class UpLoadController {
	@Autowired
	UpLoadService service;

	@PostMapping("upLoad")
	public String upLoad(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "file", "filename", "type" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}
			int id = service.upLoad(Integer.parseInt(params.get("file")), params.get("filename"),
					Integer.parseInt(params.get("type")));
			if (id < 0) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "获取失败");
			} else {
				result = JsonUtil.jsonResponse(id, AllConstant.CODE_SUCCESS, "获取成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}

}
