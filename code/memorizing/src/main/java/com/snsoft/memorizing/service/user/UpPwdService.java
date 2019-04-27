package com.snsoft.memorizing.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.user.UpPwdMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月27日下午12:28:13
 * 
 * @Description TODO 修改密码接口Service
 */
@Service
public class UpPwdService {
	@Autowired(required = false)
	UpPwdMapper mapper;

	// 修改密码
	public Integer upPwdMapper(String account, String oldPwd, String newPwd) {
		return mapper.upPwdMapper(account, oldPwd, newPwd);
	}

}
