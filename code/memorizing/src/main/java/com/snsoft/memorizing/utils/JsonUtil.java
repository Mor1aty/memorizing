package com.snsoft.memorizing.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2016
 * 
 * @author 14信息慎伟康
 * 
 * @version 1.0
 * 
 * @date 2016年10月20日 下午1:59:44
 * 
 * @Description TODO
 *    json工具类
 *    commons-beanutils-1.9.3.jar
 *    commons-collections-3.2.2.jar
 *    commons-lang-2.6.jar
 *    commons-logging-1.2.jar
 *    ezmorph-1.0.6.jar
 *    json_simple-1.1.jar
 *    json-lib-2.4-jdk15.jar
 */
public final class JsonUtil {
	
	/**
	 * 返回json字符串
	 * @param data
	 * @param code
	 * @param msg
	 * @return
	 * @Description TODO
	 */
	public static String jsonResponse(Object data, int code, String msg){
		HashMap<String, Object> resultMap= new HashMap<String, Object>();//返回结果
		resultMap.put("code", code);
		resultMap.put("msg", msg);
		resultMap.put("data", data);
		
		JSONObject jsonObject = new JSONObject(resultMap);
		return jsonObject.toString();
	}
	
	/**
	 * 将请求中的json数据转为HashMap对象
	 * @param request
	 * @return
	 * @throws IOException
	 * @Description TODO
	 */
	public static HashMap<String,String> getRequestParams(HttpServletRequest request)
			throws IOException{
		if(request == null)
			return null;
		HashMap<String,String> reqParams = new HashMap<String, String>();
		request.setCharacterEncoding(AllConstant.ENCONDING);
		
		//取得数据流
		BufferedReader reader = request.getReader();
		StringBuffer buffer = new StringBuffer("");
		String temp;
		while((temp = reader.readLine()) != null){
			buffer.append(temp);
		}
		reader.close();
//		String acceptjson = buffer.toString();//若前端进行了URL编码，则需解码
		String acceptjson = URLDecoder.decode(buffer.toString(), AllConstant.ENCONDING);
		
		//解析数据
		if(!StringUtils.isBlank(acceptjson)){
			if(acceptjson.contains("=")){
				if(acceptjson.contains("&")){//处理多个参数的情况
					String[] map = acceptjson.split("&");
					for(String item : map){
						
						String[] tempItem = item.split("=");
						String value = "";
						if(tempItem.length == 2){//防止数组越界
							value = tempItem[1];
						}
						reqParams.put(tempItem[0], value);
					}
				}else{//处理1个参数的情况
					String[] map = acceptjson.split("=");
					String value = "";
					if(map.length == 2){//防止数组越界
						value = map[1];
					}
					reqParams.put(map[0], value);
				}
			} else {
				//json字符串转化为JSONObject对象
				JSONObject jo = new JSONObject(acceptjson);
				//该批注的作用是给编译器一条指令，告诉它对被批注的代码元素内部的某些警告保持静默
				Iterator<String> it = jo.keys();
				while(it.hasNext()){
					String key = (String) it.next();
					String value = jo.getString(key);
					reqParams.put(key, value);
				}
			}
		}else{//用request自带方法取参数
			Enumeration<String> enu = request.getParameterNames();
			while(enu.hasMoreElements()){
				String tempEnu = enu.nextElement();
				reqParams.put(tempEnu, request.getParameter(tempEnu));
			}
		}
		
		return reqParams;
	}
	
}