package com.snsoft.memorizing.service.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.task.GetCurrentBlankInfoBean;
import com.snsoft.memorizing.mapper.task.GetCurrentBlankMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午2:54:47
 * 
 * @Description TODO 获取当前任务填空题接口Service
 */
@Service
public class GetCurrentBlankService {
	@Autowired(required = false)
	GetCurrentBlankMapper mapper;

	public List<GetCurrentBlankInfoBean> getCurrentBlank(int task_stage,String account) {
		return mapper.getCurrentBlank(task_stage,account);
	}
}
