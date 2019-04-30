package com.snsoft.memorizing.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.task.GetCurrentBlankInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午2:50:05
 * 
 * @Description TODO 获取当前任务填空题接口Mapper
 */
public interface GetCurrentBlankMapper {
	@Select("SELECT id,content,gmt_create FROM task_blank WHERE task_blank.task_stage=#{task_stage}")
	public List<GetCurrentBlankInfoBean> getCurrentBlank(int task_stage, String account);
}
