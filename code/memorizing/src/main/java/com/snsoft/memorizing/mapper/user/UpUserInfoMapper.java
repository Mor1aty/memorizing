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
 * @date 2019年4月27日上午11:18:52
 * 
 * @Description TODO 设置个人信息接口Mapper
 */
public interface UpUserInfoMapper {
	// 设置个人信息
	@Update("UPDATE user SET nickname=#{nickname},gender=#{gender},age=#{age} WHERE account=#{account}")
	public Integer upUserInfoMapper(String nickname, int gender, int age, String account);
}
