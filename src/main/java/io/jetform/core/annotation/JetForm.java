package io.jetform.core.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import org.springframework.stereotype.Component;

@Retention(RUNTIME)
@java.lang.annotation.Target(TYPE)
@Component
public @interface JetForm {
    String id() default "";
    String name() default "";
    String title() default "";
    boolean listIndex() default true;
    boolean selectable() default true;
    FormAction [] actions();
    String filter() default "";
    String formTemplate() default "";
    FormElementGroup[] groups() default {};
}
