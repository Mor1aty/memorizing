package com.snsoft.memorizing.mapper.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月24日下午8:30:28
 * 
 * @Description TODO 
 *	注册接口 Mapper
 */
public interface RegisterMapper {
	
	// 注册
	@Insert("INSERT INTO user(account,pwd,nickname,gender,age,portrait,score,gmt_create) "
			+ "VALUES(#{account},#{pwd},#{nickname},#{gender},#{age},1,0,now())")
	public Integer register(String account,String pwd,String nickname,int gender,int age);
	
	// 检测账号重复
	@Select("SELECT COUNT(*) FROM user WHERE account = #{account}")
	public Integer judgeUserExist(String account);

}
