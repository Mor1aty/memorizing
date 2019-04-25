package com.snsoft.memorizing.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.user.GetUserInfoBean;
import com.snsoft.memorizing.mapper.user.GetUserInfoMapper;

/**
 * 
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月24日下午9:08:17
 * 
 * @Description TODO 获取个人信息接口 Service
 */
@Service
public class GetUserInfoService {
	@Autowired(required = false)
	GetUserInfoMapper mapper;

	public GetUserInfoBean getUserInfo(String account) {
		return mapper.getUserInfo(account);
	}
}
