package com.snsoft.memorizing.service.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.manager.GetTaskMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午7:44:26
 * 
 * @Description TODO 获取用户当前计划及子计划接口Service
 */
@Service
public class GetTaskService {
	@Autowired(required = false)
	GetTaskMapper mapper;

	public List getTask(String account) {
		int i = mapper.isManager(account);
		if (i > 0) {
			List list = new ArrayList();
			list.add(mapper.getTask());
			list.add(mapper.getTask_Stage());
			return list;
		} else {
			return null;
		}
	}
}
