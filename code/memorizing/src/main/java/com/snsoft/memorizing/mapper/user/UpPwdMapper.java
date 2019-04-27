package com.snsoft.memorizing.mapper.user;

import org.apache.ibatis.annotations.Update;

/**
 * 
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月27日下午12:10:03
 * 
 * @Description TODO 修改密码接口Mapper
 */
public interface UpPwdMapper {
	// 更新密码
	@Update("UPDATE user SET pwd=#{newPwd} WHERE account=#{account}&&pwd=#{oldPwd}")
	public Integer upPwdMapper(String account, String oldPwd, String newPwd);
}
