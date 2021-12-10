package io.jetform.core.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.jetform.core.enums.LoadType;
import io.jetform.core.enums.ResourceType;
import io.jetform.core.enums.UploadType;

@Radio
@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface FormElement {
	String id() default "";
	String name() default "";
	String label() default "";
	String value() default "";
	String placeHolder() default "Enter Some Text  ";
	String errorMessage() default "";
	
	boolean required() default false;
	boolean readOnly() default false;
	boolean disabled() default false;
	boolean listable() default true;
	boolean autocomplete() default false;
	
	Form form() default @Form(childKey = "",parentKey = "");
	Text text() default @Text();
	TextArea textarea() default @TextArea;
	Hidden hidden() default @Hidden;
	Select select() default @Select();
	Number number() default @Number();
	Email email() default @Email();
	Upload upload() default @Upload();	
	Radio radio() default @Radio(dataProvider = @DataProvider(loadType = LoadType.LAZY,path = "",resource = ResourceType.WEB));	
	Checkbox checkbox() default @Checkbox(dataProvider = @DataProvider(loadType = LoadType.LAZY,path = "",resource = ResourceType.WEB));
	Date date() default @Date();
	Validation[] validations() default {};
}
