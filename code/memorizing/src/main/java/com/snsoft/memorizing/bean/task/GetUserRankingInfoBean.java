package com.snsoft.memorizing.bean.task;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月29日下午1:16:38
 * 
 * @Description TODO 获取当前用户排名信息 返回Bean
 */
public class GetUserRankingInfoBean {
	private String account;
	private String nickname;
	private int score;

	@Override
	public String toString() {
		return "GetUserRankingInfoBean [account=" + account + ", nickname=" + nickname + ", score=" + score + "]";
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
