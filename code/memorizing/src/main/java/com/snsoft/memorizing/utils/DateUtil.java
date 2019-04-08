package com.snsoft.memorizing.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @copyright ：grg工作室 版权所有 © 2017
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2017年10月19日 下午7:56:21
 * 
 * @Description TODO 转化实践格式
 */

public class DateUtil {
	public static String dateToString(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(date);
	}
	public static String dateToString2(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(date);
	}
	
}
