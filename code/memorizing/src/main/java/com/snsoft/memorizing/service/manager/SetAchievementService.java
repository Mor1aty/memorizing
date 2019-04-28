package com.snsoft.memorizing.service.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.manager.SetAchievementMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午8:18:35
 * 
 * @Description TODO 设置成就接口Service
 */
@Service
public class SetAchievementService {
	@Autowired(required = false)
	SetAchievementMapper mapper;

	public int setAchievement(String account, String content) {
		int i = mapper.isManager(account);
		if (i > 0) {
			return mapper.setAchievement(content,account);
		} else {
			return -1;
		}
	}
}
