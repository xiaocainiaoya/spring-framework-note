package cn.com.xiaocainiao.anno;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @AliasFor 别名注解测试
 * 	若在path()上标记@AliasFor, value()上不标记@AliasFor, 这时给path/value, 其实都能使得二者结果一直
 * 		所以@AliasFor可以不互相标记, 但是为了提高可读性和避免隐式别名带来的值覆盖, 还是使用二者相关标记
 *
 *
 *
 *
 * @Author: xiaocainiaoya
 * @Date: 2021/08/30 11:01:08
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AliasForAnnotation {
	//@AliasFor(value = "path")
	String value() default "";

	@AliasFor(value = "value")
	String path() default "";

}
