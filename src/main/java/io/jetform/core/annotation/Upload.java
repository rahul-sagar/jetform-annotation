package io.jetform.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.jetform.core.enums.LoadType;
import io.jetform.core.enums.ResourceType;
import io.jetform.core.enums.UploadType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@EnableFormBuilder
public @interface Upload {
	
	UploadType type() default UploadType.IMAGE;
	DataProvider dataProvider() default @DataProvider(loadType=LoadType.LAZY,path="",resource=ResourceType.FILE);	
}
