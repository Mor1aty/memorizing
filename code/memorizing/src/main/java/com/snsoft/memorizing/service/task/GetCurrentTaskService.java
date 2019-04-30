package com.snsoft.memorizing.service.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.task.GetCurrentTaskInfoBean;
import com.snsoft.memorizing.mapper.task.GetCurrentTaskMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午1:01:47
 * 
 * @Description TODO 获取当前任务接口Service
 */
@Service
public class GetCurrentTaskService {
	@Autowired(required = false)
	GetCurrentTaskMapper mapper;

	public GetCurrentTaskInfoBean getCurrentTask(String account) {

		return mapper.getCurrentTask(account);

	}
}
