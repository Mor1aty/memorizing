package com.snsoft.memorizing.service.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.user.GetUserInfoBean;
import com.snsoft.memorizing.mapper.task.GetUserRankingMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午4:56:54
 * 
 * @Description TODO 获取当前用户排名接口Service
 */
@Service
public class GetUserRankingService {
	@Autowired(required = false)
	GetUserRankingMapper mapper;

	public List<GetUserInfoBean> getUserRanking(String account) {
		return mapper.getUserRanking(account);
	}
}
