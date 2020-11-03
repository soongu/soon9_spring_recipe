package kr.co.kokono.recipe.chap02.r2_4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface NumberPrefixAnnotation {
}
