package com.snsoft.memorizing.bean.user;
/**
 * 
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月24日下午9:01:33
 * 
 * @Description TODO 
 *	获取个人信息接口 返回 Bean
 */
public class GetUserInfoBean {
	private String account;
	private String nickname;
	private int gender;
	private int age;
	private String portrait;
	private int score;
	@Override
	public String toString() {
		return "GetUserInfoBean [account=" + account + ", nickname=" + nickname + ", gender=" + gender + ", age=" + age
				+ ", portrait=" + portrait + ", score=" + score + "]";
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
