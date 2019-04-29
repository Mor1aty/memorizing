package com.snsoft.memorizing.controller.task;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snsoft.memorizing.bean.task.GetUserRankingInfoBean;
import com.snsoft.memorizing.service.task.GetUserRankingService;
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
 * @date 2019年4月28日下午4:58:50
 * 
 * @Description TODO 获取当前用户排名接口Controller
 */
@RestController
public class GetUserRankingController {
	@Autowired
	GetUserRankingService service;

	@GetMapping("getUserRanking")
	public String completeSmallTask(HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			List<GetUserRankingInfoBean> list = service.getUserRanking(session.getAttribute("loginmark").toString());
			if (list == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "获取失败");
			} else {
				result = JsonUtil.jsonResponse(list, AllConstant.CODE_SUCCESS, "获取成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
