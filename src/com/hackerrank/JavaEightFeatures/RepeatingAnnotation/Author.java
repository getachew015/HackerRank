package com.hackerrank.JavaEightFeatures.RepeatingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
public @interface Author {
	/* Repeating Annotations in Java-8
	 * In a case of requirement to add information about who modified what methods and who created
	 * which methods the below interface helps
	 */
	
	
	String name();
	String method();

}
