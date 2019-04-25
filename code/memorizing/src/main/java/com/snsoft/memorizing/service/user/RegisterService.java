package com.snsoft.memorizing.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.user.RegisterMapper;

/**
 * 
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月24日下午8:40:48
 * 
 * @Description TODO 注册接口 Service
 */
@Service
public class RegisterService {

	@Autowired(required = false)
	RegisterMapper mapper;

	// 注册
	public Integer register(String account, String pwd, String nickname, int gender, int age) {

		return mapper.register(account, pwd, nickname, gender, age);
	}

	// 检测账号重复
	public Integer judgeUserExist(String account) {
		return mapper.judgeUserExist(account);
	}

}
