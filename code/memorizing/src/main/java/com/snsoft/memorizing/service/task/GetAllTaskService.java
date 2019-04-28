package com.snsoft.memorizing.service.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.task.GetAllTaskMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日上午9:40:15
 * 
 * @Description TODO 获取所有任务接口Service
 */
@Service
public class GetAllTaskService {
	@Autowired(required = false)
	GetAllTaskMapper mapper;

	public List getAllTask(String account) {
		return mapper.getAllTask(account);
	}
}
