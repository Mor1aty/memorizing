package com.snsoft.memorizing.mapper.user;

import org.apache.ibatis.annotations.Select;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年4月8日下午4:24:56
 * 
 * @Description TODO 
 *	登录接口 Mapper
 */
public interface LoginMapper {
	// 判断普通用户是否存在
	@Select("SELECT COUNT(*) FROM user WHERE account=#{account} AND pwd=#{pwd}")
	public Integer judgeUserExist(String account, String pwd);

	// 判断管理员用户是否存在
	@Select("SELECT COUNT(*) FROM manager WHERE account=#{account} AND pwd=#{pwd}")
	public Integer judgeManagerExist(String account, String pwd);
}
