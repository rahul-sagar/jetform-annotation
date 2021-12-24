package io.jetform.core.annotation;

public @interface DependentField {
   String child() default "";
   String datapath() default "";
   String type() default "";
}
