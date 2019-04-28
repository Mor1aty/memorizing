package com.snsoft.memorizing.service.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.task.UpLoadPointMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日上午11:35:39
 * 
 * @Description TODO 上传重点接口Servicce
 */
@Service
public class UpLoadPointService {
	@Autowired(required = false)
	UpLoadPointMapper mapper;

	public int upLoadPoint(int task, String point) {
		return mapper.upLoadPoint(task, point);
	}
}
