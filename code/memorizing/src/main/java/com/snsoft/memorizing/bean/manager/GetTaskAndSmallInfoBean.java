package com.snsoft.memorizing.bean.manager;

import java.util.List;

import com.snsoft.memorizing.bean.task.GetTask_StageInfoBean;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日下午1:29:47
 * 
 * @Description TODO 获取用户当前计划信息 返回Bean
 */
public class GetTaskAndSmallInfoBean {
	private int id;
	private String content;
	private int file;
	private String gmtCreate;
	private String gmtEnd;
	private List<GetTask_StageInfoBean> list;

	@Override
	public String toString() {
		return "GetTaskAndSmallInfoBean [id=" + id + ", content=" + content + ", file=" + file + ", gmtCreate="
				+ gmtCreate + ", gmtEnd=" + gmtEnd + ", list=" + list + "]";
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

	public int getFile() {
		return file;
	}

	public void setFile(int file) {
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

	public List<GetTask_StageInfoBean> getList() {
		return list;
	}

	public void setList(List<GetTask_StageInfoBean> list) {
		this.list = list;
	}

}
