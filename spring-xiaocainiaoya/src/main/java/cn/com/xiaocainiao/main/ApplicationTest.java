package cn.com.xiaocainiao.main;

import cn.com.xiaocainiao.anno.AliasForAnnotation;
import cn.com.xiaocainiao.config.AppConfig;
import cn.com.xiaocainiao.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;

/**
 *
 *
 * @Author: xiaocainiaoya
 * @Date: 2021/06/16 09:28:32
 **/
public class ApplicationTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(UserService.class));
		AliasForAnnotation aliasForAnnotation = AnnotationUtils.getAnnotation(UserService.class, AliasForAnnotation.class);
		System.out.println("value:" + aliasForAnnotation.value() + "\npath:" + aliasForAnnotation.path());
	}


}
