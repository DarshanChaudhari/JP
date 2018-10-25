package com.darshan;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface Author {

    String value() default "Darshan chaudhari";


}
