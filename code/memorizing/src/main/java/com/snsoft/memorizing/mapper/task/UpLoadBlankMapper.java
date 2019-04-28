package com.snsoft.memorizing.mapper.task;

import org.apache.ibatis.annotations.Insert;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日上午11:56:44
 * 
 * @Description TODO 上传填空题接口Mapper
 */
public interface UpLoadBlankMapper {
	@Insert("INSERT INTO task_blank(task_stage,content,gmt_create) VALUES(#{task_stage},#{content},now())")
	public int upLoadBlank(int task_stage, String content);
}
