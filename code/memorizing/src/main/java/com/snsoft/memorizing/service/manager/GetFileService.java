package com.snsoft.memorizing.service.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snsoft.memorizing.bean.task.GetFileInfoBean;
import com.snsoft.memorizing.mapper.manager.GetFileMapper;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年4月28日下午7:57:22
 * 
 * @Description TODO 查看用户上传文件接口Service
 */
@Service
public class GetFileService {
	@Autowired(required = false)
	GetFileMapper mapper;

	public List<GetFileInfoBean> getFile(String account) {
		int i = mapper.isManager(account);
		if (i > 0) {
			return mapper.getFileMapper();
		} else {
			return null;
		}
	}
}
