package com.snsoft.memorizing.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.user.GetUserInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午4:53:39
 * 
 * @Description TODO 获取当前用户排名Mapper
 */
public interface GetUserRankingMapper {

	@Select("SELECT account,nickname,score FROM user WHERE account=#{account}")
	public List<GetUserInfoBean> getUserRanking(String account);
}
