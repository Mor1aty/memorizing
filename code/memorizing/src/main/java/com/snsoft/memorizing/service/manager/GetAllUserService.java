package com.snsoft.memorizing.service.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.user.GetUserInfoBean;
import com.snsoft.memorizing.mapper.manager.GetAllUserMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午6:03:55
 * 
 * @Description TODO 获取所有用户接口Service
 */
@Service
public class GetAllUserService {
	@Autowired(required = false)
	GetAllUserMapper mapper;

	public List<GetUserInfoBean> getAllUser(String account) {
		int i = mapper.isManager(account);
		if (i > 0) {
			return mapper.getAllUser();
		} else {
			return null;
		}
	}
}
