package cn.com.xiaocainiao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 *
 * @Author: xiaocainiaoya
 * @Date: 2021/06/16 11:26:23
 **/
@Service
public class HomeService {

	@Resource
	private UserService userService;
}
