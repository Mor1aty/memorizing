package com.snsoft.memorizing.bean.task;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午9:16:59
 * 
 * @Description TODO 获取当前任务填空题信息接口 返回Bean
 */
public class GetCurrentBlankInfoBean {
	private int id;
	private String content;
	private String gmtCreate;

	@Override
	public String toString() {
		return "GetCurrentBlankInfoBean [id=" + id + ", content=" + content + ", gmtCreate=" + gmtCreate + "]";
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

	public String getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

}
