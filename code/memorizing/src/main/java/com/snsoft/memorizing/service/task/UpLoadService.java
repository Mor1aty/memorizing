package com.snsoft.memorizing.service.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.task.UpLoadMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月27日下午8:05:48
 * 
 * @Description TODO 上传接口Service
 */
@Service
public class UpLoadService {
	@Autowired(required = false)
	UpLoadMapper mapper;

	public int upLoad(int file, String filename, int type) {
		return mapper.upLoad(file, filename, type);
	}
}
