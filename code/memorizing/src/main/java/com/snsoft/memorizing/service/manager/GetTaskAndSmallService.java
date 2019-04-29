package com.snsoft.memorizing.service.manager;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.manager.GetTaskAndSmallInfoBean;
import com.snsoft.memorizing.bean.task.GetTask_StageInfoBean;
import com.snsoft.memorizing.mapper.manager.GetTaskAndSmallMapper;

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
public class GetTaskAndSmallService {
	@Autowired(required = false)
	GetTaskAndSmallMapper mapper;

	public GetTaskAndSmallInfoBean getTask(String account,String user_account) {
		int i = mapper.isManager(account);
		if (i > 0) {
			Map<String, BigInteger> id = mapper.getId(user_account);
			if(id==null||id.get("task")==null) {
				return null;
			}
			GetTaskAndSmallInfoBean list = mapper.getTask(id.get("task"));
			if(list==null) {
				return null;
			}
			
			List<GetTask_StageInfoBean> lst = mapper.getTask_Stage(id.get("task"));
			list.setList(lst);
			return list;
		} else {
			return null;
		}
	}
}
