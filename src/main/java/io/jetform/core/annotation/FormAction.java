package io.jetform.core.annotation;


import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.jetform.core.enums.Action;
import io.jetform.core.enums.Type;

@Retention(RUNTIME)
@Target(FIELD)
@EnableFormBuilder
public @interface FormAction {
     String name();
     Action action()  default Action.CREATE;
     Type type() default Type.BUTTON;
     String label() default "";
     boolean listable() default false;
}
