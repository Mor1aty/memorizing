package com.snsoft.memorizing.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.task.GetAllTaskInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日上午8:35:01
 * 
 * @Description TODO 获取所有任务接口Mapper
 */
public interface GetAllTaskMapper {
	// 根据用户账号获取所有任务
	@Select("SELECT task.id,task.gmt_create,gmt_end,is_use,name FROM task "
			+ "LEFT JOIN history ON history.task=task.id LEFT JOIN classify "
			+ "ON history.user=classify.user WHERE classify.user=#{account}")
	public List<GetAllTaskInfoBean> getAllTask(String account);
}
