package io.jetform.core.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.jetform.core.enums.LoadType;
import io.jetform.core.enums.ResourceType;


/**
 * Checkbox Annotation helps to genrate
 * ckeckbox type input field elements in Html
 *
 * @author Sumant Chaubey
 * @see Text
 * @see Date
 * @see File
 * @see Hidden
 * @see Select
 * @see Radio
 * @see Email
 * @see Password
 * @see Telephone
 */
@Retention(RUNTIME)
@Target(FIELD)
@EnableFormBuilder
public @interface Checkbox {
	
	//SelectionType selectionType() default SelectionType.Single;
	boolean multiSelect() default false;
	DataProvider dataProvider() default @DataProvider(loadType = LoadType.LAZY,path = "",resource = ResourceType.REST);
	String[] options() default {};
}
