package com.snsoft.memorizing.bean.task;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月27日下午1:55:58
 * 
 * @Description TODO 获取当前任务信息 返回Bean
 */
public class GetCurrentTaskInfoBean {
	private int id;
	private String content;
	private String file;
	private String gmtCreate;

	@Override
	public String toString() {
		return "GetCurrentTaskInfoBean [id=" + id + ", content=" + content + ", file=" + file + ", gmtCreate="
				+ gmtCreate + "]";
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

}
