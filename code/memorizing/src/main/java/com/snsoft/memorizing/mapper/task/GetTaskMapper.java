package com.snsoft.memorizing.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.task.GetTaskSectorInfoBean;
import com.snsoft.memorizing.bean.task.GetTask_StageInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日上午8:47:55
 * 
 * @Description TODO 获取任务详细接口Mapper
 */
public interface GetTaskMapper {
	// 获取任务
	@Select("SELECT task.id,task.content,task.file,task.gmt_create,task.gmt_end,task.is_use,classify.`name`"
			+ "FROM task LEFT JOIN history ON history.task=task.id LEFT JOIN classify ON history.user=classify.user  WHERE task.id=#{id}")
	public GetTaskSectorInfoBean getTask1(int id);

	// 获取阶段任务
	@Select("SELECT task_stage.id,task_stage.content,task_stage.step,task_stage.gmt_create,task_stage.gmt_end,task_stage.is_use FROM task_stage LEFT JOIN task ON task_stage.task=task.id WHERE task_stage.task=#{id}")
	public List<GetTask_StageInfoBean> getTask2(int id);
}
