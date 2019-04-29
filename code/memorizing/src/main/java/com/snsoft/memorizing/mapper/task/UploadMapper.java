package com.snsoft.memorizing.mapper.task;

import java.util.HashMap;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日下午9:02:13
 * 
 * @Description TODO 
 *	上传接口 Mapper
 */
public interface UploadMapper {
	// 写入附件表
	@Insert("INSERT INTO attach(file_name,file_location,type,gmt_create) VALUES(#{filename},#{location},#{type},now())")
	@Options(useGeneratedKeys=true, keyProperty="map.id", keyColumn="id")
	public Integer addAttach(String filename,String location,int type,HashMap<String,Integer> map);
}
