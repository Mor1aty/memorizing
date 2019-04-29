package com.snsoft.memorizing.bean.task;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日下午12:26:45
 * 
 * @Description TODO 获取所有任务信息 返回Bean
 */
public class GetAllTaskInfoBean {
	private int id;
	private String gmtCreate;
	private String gmtEnd;
	private int isUse;
	private String name;

	@Override
	public String toString() {
		return "GetAllTaskInfoBean [id=" + id + ", gmtCreate=" + gmtCreate + ", gmtEnd=" + gmtEnd + ", isUse=" + isUse
				+ ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtEnd() {
		return gmtEnd;
	}

	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public int getIsUse() {
		return isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
