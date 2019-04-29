package com.snsoft.memorizing.bean.task;

import java.util.List;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日下午12:38:11
 * 
 * @Description TODO 获取任务详细信息 返回Bean
 */
public class GetTaskSectorInfoBean {
	private int id;
	private String content;
	private String file;
	private String gmtCreate;
	private String gmtEnd;
	private int isUse;
	private String name;
	private List<GetTask_StageInfoBean> list;

	@Override
	public String toString() {
		return "GetTaskSectorInfoBean [id=" + id + ", content=" + content + ", file=" + file + ", gmtCreate="
				+ gmtCreate + ", gmtEnd=" + gmtEnd + ", isUse=" + isUse + ", name=" + name + ", list=" + list + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
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

	public List<GetTask_StageInfoBean> getList() {
		return list;
	}

	public void setList(List<GetTask_StageInfoBean> list) {
		this.list = list;
	}

}
