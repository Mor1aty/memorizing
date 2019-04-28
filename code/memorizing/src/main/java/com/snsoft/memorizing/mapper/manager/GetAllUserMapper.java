package com.snsoft.memorizing.mapper.manager;

import java.util.List;
import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.manager.GetManagerInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午5:40:18
 * 
 * @Description TODO 获取所有用户接口Mapper
 */
public interface GetAllUserMapper {
	// 判断是否是管理员
	@Select("SELECT COUNT(*) FROM manager WHERE account=#{account}")
	public int isManager(String account);

	// 通过管理员获取所有用户
	@Select("SELECT account,nickname,gender,age,portrait,score FROM user")
	public List<GetManagerInfoBean> getAllUser();
}