package com.snsoft.memorizing.service.task;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.task.UploadMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日下午9:07:02
 * 
 * @Description TODO 上传接口 Service
 */
@Service
public class UploadService {

	@Autowired(required = false)
	UploadMapper mapper;

	public Integer addAttach(String filename, String location, int type) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("id", -1);
		mapper.addAttach(filename, location, type, map);
		return map.get("id");
	}
}
