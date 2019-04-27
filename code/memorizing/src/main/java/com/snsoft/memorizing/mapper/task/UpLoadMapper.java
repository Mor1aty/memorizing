package com.snsoft.memorizing.mapper.task;

import org.apache.ibatis.annotations.Select;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月27日下午7:41:02
 * 
 * @Description TODO 上传接口Mapper
 */
public interface UpLoadMapper {
	@Select("SELECT task.id FROM task LEFT JOIN attach ON task.file=attach.id WHERE task.file=#{file} AND attach.file_name=#{filename} AND attach.type=#{type}")
	public int upLoad(int file, String filename, int type);
}
