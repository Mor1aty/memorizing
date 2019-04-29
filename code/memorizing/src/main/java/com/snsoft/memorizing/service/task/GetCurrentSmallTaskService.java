package com.snsoft.memorizing.service.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.task.GetCurrentSmallTaskInfoBean;
import com.snsoft.memorizing.mapper.task.GetCurrentSmallTaskMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午1:21:58
 * 
 * @Description TODO 获取当前阶段任务接口Service
 */
@Service
public class GetCurrentSmallTaskService {
	@Autowired(required = false)
	GetCurrentSmallTaskMapper mapper;

	public GetCurrentSmallTaskInfoBean getCurrentSmallTask(int task) {
		return mapper.getCurrentSmallTask(task);
	}
}
