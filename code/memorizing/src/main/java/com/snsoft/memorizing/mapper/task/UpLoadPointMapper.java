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
 * @date 2019年4月28日上午11:25:04
 * 
 * @Description TODO 
 * 上传重点接口Mapper
 */
public interface UpLoadPointMapper {
    @Insert("INSERT INTO `key`(task,point,gmt_create)VALUES(#{task},#{point},now())")
    public int upLoadPoint(int task,String point);
}
