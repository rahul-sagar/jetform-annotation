package io.jetform.core.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.jetform.core.enums.Action;
import io.jetform.core.enums.Type;
import io.jetform.core.enums.FormActionType;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

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
