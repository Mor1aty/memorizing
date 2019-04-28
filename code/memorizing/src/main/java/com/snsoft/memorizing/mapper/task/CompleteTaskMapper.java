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
 * @date 2019年4月28日下午3:08:12
 * 
 * @Description TODO 完成当前任务接口Mapper
 */
public interface CompleteTaskMapper {
	@Update("UPDATE history  SET history.is_finish=1 WHERE history.task=#{id}")
	public int completeTask(int id);
}
