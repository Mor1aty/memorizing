package com.snsoft.memorizing.utils;

import java.util.HashMap;
import java.util.Set;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 (c) 2016
 * 
 * @author zmk
 * 
 * @version 1.0
 * 
 * @date 2016年7月8日 下午5:17:58
 * 
 * @Description TODO 测试servlet类，模拟浏览器向自己写的servlet发送post和get请求，提交请求参数，方便测试。
 */

public class HttpUtil {	

	/**
	 * 校验封装的request的请求参数，若为null或者所要参数不存在则返回错误信息
	 * 
	 * @param map
	 * @param strings 要检验的参数数组
	 * @return
	 */
	public static String checkParams(HashMap<String, String> param, String[] strings) {
		String result = "";
		if (param == null) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "缺少请求参数");
		} else {
			Set<String> keySet = param.keySet();
			if (strings != null && strings.length > 0) {
				for (String string : strings) {
					// 校验参数是否存在
					boolean contains = keySet.contains(string);
					if (!contains) {
						result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "缺少" + string + "参数");
						return result;
					}
				}
			}
			for (String key : keySet) {
				// 通过传入的所要检验参数的值，比如要检验account和id字段，传入{"account"，"id"},检验该参数是否存在

				if (param.get(key) == null || "".equals(param.get(key))) {
					result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, key + "参数不能为空");
					return result;
				}
			}
		}
		return result;
	}
}
