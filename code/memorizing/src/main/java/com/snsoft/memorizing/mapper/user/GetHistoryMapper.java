package com.snsoft.memorizing.mapper.user;
/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月27日下午1:42:09
 * 
 * @Description TODO 
 * 获取历史任务接口Mapper
 */

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.task.GetTaskInfoBean;

public interface GetHistoryMapper {
	// 根据账号获取用户的历史任务
	@Select("SELECT task.id,content,file_location AS file,task.gmt_Create,task.gmt_End,task.is_Use FROM history LEFT JOIN task ON history.task=task.id LEFT JOIN attach ON task.file = attach.id  WHERE history.user=#{account}")
	public List<GetTaskInfoBean> getTaskId(String account);
}