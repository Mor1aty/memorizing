package com.snsoft.memorizing.bean.manager;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午5:36:57
 * 
 * @Description TODO 获取管理员信息接口 返回Bean
 */
public class GetManagerInfoBean {
	private String account;
	private String pwd;
	private String nickname;
	private String gmtCreat;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGmtCreat() {
		return gmtCreat;
	}

	public void setGmtCreat(String gmtCreat) {
		this.gmtCreat = gmtCreat;
	}

	@Override
	public String toString() {
		return "GetManagerInfoBean [account=" + account + ", pwd=" + pwd + ", nickname=" + nickname + ", gmtCreat="
				+ gmtCreat + "]";
	}

}
