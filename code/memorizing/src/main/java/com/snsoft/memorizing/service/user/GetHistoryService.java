package com.snsoft.memorizing.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.task.GetHistoryInfoBean;
import com.snsoft.memorizing.mapper.user.GetHistoryMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月27日下午3:29:56
 * 
 * @Description TODO 获取历史任务接口Service
 */
@Service
public class GetHistoryService {
	@Autowired(required = false)
	GetHistoryMapper mapper;

	public List<GetHistoryInfoBean> getHistory(String account) {
		return mapper.getTaskId(account);
	}
}
