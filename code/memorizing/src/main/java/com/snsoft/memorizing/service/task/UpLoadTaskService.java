package com.snsoft.memorizing.service.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.task.UpLoadTaskMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日上午10:18:59
 * 
 * @Description TODO 上传任务接口Service
 */
@Service
public class UpLoadTaskService {
	@Autowired(required = false)
	UpLoadTaskMapper mapper;

	public int upLoadTask(String content, int file) {
		return mapper.upLoadTask(content, file);
	}
}
