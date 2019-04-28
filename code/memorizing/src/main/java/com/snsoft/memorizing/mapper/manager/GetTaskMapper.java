package com.snsoft.memorizing.mapper.manager;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.task.GetTaskInfoBean;
import com.snsoft.memorizing.bean.task.GetTask_StageInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午7:20:27
 * 
 * @Description TODO 获取用户当前计划及子计划接口Mapper
 */
public interface GetTaskMapper {
	// 判断是否是管理员
	@Select("SELECT COUNT(*) FROM manager WHERE account=#{account}")
	public int isManager(String account);

	// 获取用户当前计划
	@Select("SELECT id,content,file,gmt_create,gmt_end FROM task")
	public List<GetTaskInfoBean> getTask();

	// 获取子计划
	@Select("SELECT id,content,step,gmt_create,gmt_end,is_use FROM task_stage")
	public List<GetTask_StageInfoBean> getTask_Stage();
}
