package io.jetform.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.jetform.core.enums.LoadType;
import io.jetform.core.enums.ResourceType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@EnableFormBuilder
public @interface Image {

	DataProvider dataProvider() default @DataProvider(path="",loadType=LoadType.LAZY,resource=ResourceType.FILE);
	String alt() default "Required image is not available";
}
