package cn.com.xiaocainiao.config;

import cn.com.xiaocainiao.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @Author: xiaocainiaoya
 * @Date: 2021/06/16 09:24:51
 **/
//@Configuration
@ComponentScan("cn.com.xiaocainiao")
@Component
@Import(SubAppConfig.class)
public class AppConfig {

//	@Component
//	public class AppNestedConfig{
//		@Bean
//		public UserService userService(){
//			return new UserService();
//		}
//	}

}
