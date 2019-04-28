package com.snsoft.memorizing.controller.task;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.service.task.UpLoadBlankService;
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
 * @date 2019年4月28日下午12:08:06
 * 
 * @Description TODO 
 * 上传填空题接口Controller
 */
@RestController
public class UpLoadBlankController {
  @Autowired
  UpLoadBlankService service;
  @PostMapping("upLoadBlank")
  public String upLoadBlank(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			// 解析请求参数
			HashMap<String, String> params = JsonUtil.getRequestParams(request);
			// 参数校验
			result = HttpUtil.checkParams(params, new String[] { "task_stage", "content" });
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}

			int i = service.upLoadBlank(Integer.parseInt(params.get("task_stage")), params.get("content"));
			if (i < 0) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "上传失败");
			} else {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "上传成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
