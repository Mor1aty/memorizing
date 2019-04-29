package com.snsoft.memorizing.controller.task;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.snsoft.memorizing.service.task.UploadService;
import com.snsoft.memorizing.utils.AllConstant;
import com.snsoft.memorizing.utils.JsonUtil;
import com.snsoft.memorizing.utils.UUIDUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日下午9:10:10
 * 
 * @Description TODO 上传接口 Controller
 */
@RestController
public class UploadController {
	@Autowired
	UploadService service;

	@PostMapping("upload")
	public String upload(MultipartFile file, HttpServletRequest request, HttpSession session) {
		// 返回结果
		String result = "";
		try {
			String filename = request.getParameter("filename");
			String type = request.getParameter("type");
			if (filename == null || filename == "") {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "filename不能为空");
			}
			if (type == null || type == "") {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "type不能为空");
			}
			if (file == null || file.isEmpty()) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "file不能为空");
			}
			// 校验不通过，适用于需要请求参数的情况
			if (!"".equals(result.trim())) {
				return result;
			}

			String location = "/usr/file/" + UUIDUtil.getUUID();
			file.transferTo(new File(location));
			int i = service.addAttach(filename, location, Integer.parseInt(type));
			if (i > 0) {
				result = JsonUtil.jsonResponse(i, AllConstant.CODE_SUCCESS, "上传成功");
			} else {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "上传失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		return result;
	}
}
