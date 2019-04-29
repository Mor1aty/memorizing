package com.snsoft.memorizing.bean.task;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日下午1:12:59
 * 
 * @Description TODO 获取当前阶段任务信息 返回Bean
 */
public class GetCurrentSmallTaskInfoBean {
	private int id;
	private String content;
	private int step;
	private String gmtCreate;
	private String gmtEnd;

	@Override
	public String toString() {
		return "GetCurrentSmallTaskInfoBean [id=" + id + ", content=" + content + ", step=" + step + ", gmtCreate="
				+ gmtCreate + ", gmtEnd=" + gmtEnd + "]";
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

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
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

}
