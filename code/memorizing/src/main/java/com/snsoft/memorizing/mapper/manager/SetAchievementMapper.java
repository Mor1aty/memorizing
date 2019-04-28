package com.snsoft.memorizing.mapper.manager;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午8:09:31
 * 
 * @Description TODO 设置成就接口Mapper
 */
public interface SetAchievementMapper {
	// 判断是否是管理员
	@Select("SELECT COUNT(*) FROM manager WHERE account=#{account}")
	public int isManager(String account);

	// 设置成就
	@Insert("INSERT INTO achievement(content,creator,gmt_create) VALUES(#{content},#{account},now())")
	public int setAchievement(String content,String account);
}
