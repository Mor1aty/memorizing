package com.snsoft.memorizing.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.task.GetCurrentSmallTaskInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午1:17:09
 * 
 * @Description TODO 获取当前阶段任务接口Mapper
 */
public interface GetCurrentSmallTaskMapper {
	@Select("SELECT id,content,step,gmt_create,gmt_end FROM task_stage WHERE task_stage.task=#{id}")
	public List<GetCurrentSmallTaskInfoBean> getCurrentSmallTask(int id);
}
