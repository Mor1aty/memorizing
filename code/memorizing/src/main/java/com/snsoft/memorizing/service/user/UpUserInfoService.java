package com.snsoft.memorizing.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.user.UpUserInfoMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月27日上午11:40:21
 * 
 * @Description TODO 设置个人信息接口Service
 */
@Service
public class UpUserInfoService {
	@Autowired(required = false)
	UpUserInfoMapper mapper;

	public Integer upUserInfoService(String nickname, int gender, int age, String account) {
		return mapper.upUserInfoMapper(nickname, gender, age, account);
	}
}
