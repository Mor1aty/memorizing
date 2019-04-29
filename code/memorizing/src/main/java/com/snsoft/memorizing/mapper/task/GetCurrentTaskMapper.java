package com.snsoft.memorizing.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.task.GetCurrentTaskInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午12:44:36
 * 
 * @Description TODO 获取当前任务接口Mapper
 */
public interface GetCurrentTaskMapper {
	@Select("SELECT task.id,task.content,task.file,task.gmt_create FROM task LEFT JOIN user ON user.task=task.id WHERE user.account=#{account} ")
	public List<GetCurrentTaskInfoBean> getCurrentTask(String account);
}
