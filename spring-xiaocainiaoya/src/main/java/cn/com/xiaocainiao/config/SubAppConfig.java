package cn.com.xiaocainiao.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 *
 *
 * @Author: xiaocainiaoya
 * @Date: 2021/06/20 15:18:02
 **/
public class SubAppConfig implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[0];
	}
}
