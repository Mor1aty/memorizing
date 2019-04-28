package com.snsoft.memorizing.bean.task;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午8:05:30
 * 
 * @Description TODO 获取用户上传文件信息 返回Bean
 */
public class GetFileInfoBean {
	private int id;
	private String fileName;
	private String fileLocation;
	private int type;
	private String gmtCreate;

	@Override
	public String toString() {
		return "GetFileInfoBean [id=" + id + ", fileName=" + fileName + ", fileLocation=" + fileLocation + ", type="
				+ type + ", gmtCreate=" + gmtCreate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

}
