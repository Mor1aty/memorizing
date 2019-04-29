package com.snsoft.memorizing.service.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.task.GetTaskSectorInfoBean;
import com.snsoft.memorizing.bean.task.GetTask_StageInfoBean;
import com.snsoft.memorizing.mapper.task.GetTaskMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日上午9:12:18
 * 
 * @Description TODO 获取任务详细接口Service
 */
@Service
public class GetTaskService {
	@Autowired(required = false)
	GetTaskMapper mapper;

	public GetTaskSectorInfoBean getTask(int id) {
		GetTaskSectorInfoBean bean = mapper.getTask1(id);
		List<GetTask_StageInfoBean> list = mapper.getTask2(id);
		bean.setList(list);
		return bean;

	}
}
