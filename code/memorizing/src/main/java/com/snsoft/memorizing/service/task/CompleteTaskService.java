package com.snsoft.memorizing.service.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.task.CompleteTaskMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午4:24:06
 * 
 * @Description TODO 完成当前任务接口Service
 */
@Service
public class CompleteTaskService {
	@Autowired(required = false)
	CompleteTaskMapper mapper;

	public int completeTask(int id) {
		return mapper.completeTask(id);
	}
}
