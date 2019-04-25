package com.snsoft.memorizing.mapper.user;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.user.GetUserInfoBean;

/**
 * 
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月24日下午9:03:19
 * 
 * @Description TODO 获取个人信息接口 Mapper
 */
public interface GetUserInfoMapper {
	// 根据账号获取个人信息
	@Select("SELECT account,nickname,gender,age,attach.file_location AS portrait,"
			+ "score FROM user LEFT JOIN attach ON user.portrait = attach.id  WHERE account = #{account}")
	public GetUserInfoBean getUserInfo(String account);
}
