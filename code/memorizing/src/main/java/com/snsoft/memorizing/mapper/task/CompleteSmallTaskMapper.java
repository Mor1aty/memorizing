package com.snsoft.memorizing.mapper.task;

import org.apache.ibatis.annotations.Update;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午4:32:50
 * 
 * @Description TODO 完成当前阶段任务接口Mapper
 */
public interface CompleteSmallTaskMapper {
	@Update("UPDATE history LEFT JOIN task_stage ON history.task=task_stage.task SET history.is_finish=1 WHERE task_stage.id=#{id}")
	public int completeSmallTask(int id);
}
