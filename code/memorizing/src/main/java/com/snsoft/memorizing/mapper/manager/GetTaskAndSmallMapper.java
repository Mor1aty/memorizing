package com.snsoft.memorizing.mapper.manager;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.snsoft.memorizing.bean.manager.GetTaskAndSmallInfoBean;
import com.snsoft.memorizing.bean.task.GetTask_StageInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午7:20:27
 * 
 * @Description TODO 获取用户当前计划及子计划接口Mapper
 */
public interface GetTaskAndSmallMapper {
	// 判断是否是管理员
	@Select("SELECT COUNT(*) FROM manager WHERE account=#{account}")
	public int isManager(String account);

	// 获取用户当前计划   
	@Select("SELECT id,content,file,gmt_create,gmt_end FROM task WHERE task.id=#{id}")
	public GetTaskAndSmallInfoBean getTask(BigInteger id);

	// 获取子计划
	@Select("SELECT id,content,step,gmt_create,gmt_end,is_use FROM task_stage WHERE task=#{id}")
	public List<GetTask_StageInfoBean> getTask_Stage(BigInteger id);
	
	//从用户表获取当前任务id 
	@Select("SELECT task FROM user WHERE account=#{user_account}")
	public Map<String, BigInteger> getId(String user_account);
}
