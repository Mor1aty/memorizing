package com.snsoft.memorizing.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.snsoft.memorizing.utils.AllConstant;
import com.snsoft.memorizing.utils.JsonUtil;



/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年1月30日上午11:05:08
 * 
 * @Description TODO 登录验证过滤器
 */
public class ValidateLoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		// 转化ServletRequest为HttpRequest
		HttpServletRequest req = (HttpServletRequest) servletRequest;
		HttpServletResponse resp = (HttpServletResponse) servletResponse;
		if(req.getServletPath().equals("/login") && req.getMethod().equals("POST")) {
			filterChain.doFilter(req, resp);
			return;
		}
		if(req.getServletPath().equals("/register") && req.getMethod().equals("POST")) {
			filterChain.doFilter(req, resp);
			return;
		}
		if(req.getSession().getAttribute("loginmark") == null) {
			resp.getWriter().write(JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "请先登录"));
		}else {
			filterChain.doFilter(req, resp);
		}
	}

	@Override
	public void destroy() {

	}

}
