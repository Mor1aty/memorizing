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
 * @date 2019年4月28日上午9:48:33
 * 
 * @Description TODO 上传任务接口Mapper
 */
public interface UpLoadTaskMapper {

	@Insert("INSERT INTO task(content,file,gmt_create,is_use) VALUES(#{content},#{file},now(),0)")
	public int upLoadTask(String content, int file);
}
