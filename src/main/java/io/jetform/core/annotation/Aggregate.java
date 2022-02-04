package io.jetform.core.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.jetform.core.enums.AggregationType;



@Retention(RUNTIME)
@Target(FIELD)
public @interface Aggregate {
  String element() default "";
  AggregationType type() default AggregationType.SUM;
}
