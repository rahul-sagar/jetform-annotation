package io.jetform.core.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target(TYPE)
public @interface FormElementGroup {
	String id();
	String label() default "";
	int elementsPerRow() default 1;
}
