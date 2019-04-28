package com.snsoft.memorizing.service.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.mapper.task.UpLoadBlankMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午12:06:18
 * 
 * @Description TODO 上传填空题接口Service
 */
@Service
public class UpLoadBlankService {
	@Autowired(required = false)
	UpLoadBlankMapper mapper;

	public int upLoadBlank(int task_stage, String content) {
		return mapper.upLoadBlank(task_stage, content);
	}
}
