package com.snsoft.memorizing.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.user.LoginMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年4月8日下午4:24:44
 * 
 * @Description TODO 
 *	登录接口 Service
 */
@Service
public class LoginService {
	@Autowired(required=false)
	LoginMapper mapper;
	
	public Integer login(Integer type,String account,String pwd) {
		if(type == 0) {
			//普通用户
			return mapper.judgeUserExist(account, pwd);
		}else {
			//管理员用户
			return mapper.judgeManagerExist(account, pwd);
		}
	}
}
