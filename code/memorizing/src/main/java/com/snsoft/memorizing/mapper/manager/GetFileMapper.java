package com.snsoft.memorizing.mapper.manager;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.task.GetFileInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午7:54:10
 * 
 * @Description TODO 查看用户上传文件接口Mapper
 */
public interface GetFileMapper {
	// 判断是否是管理员
	@Select("SELECT COUNT(*) FROM manager WHERE account=#{account}")
	public int isManager(String account);

	// 查询上传文件
	@Select("SELECT id,file_name,file_location,gmt_create FROM attach")
	public List<GetFileInfoBean> getFileMapper();
}
