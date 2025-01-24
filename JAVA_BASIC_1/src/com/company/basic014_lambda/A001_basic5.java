package com.company.basic014_lambda;

import java.util.function.Consumer;

public class A001_basic5 {

	public static void main(String[] args) {
		// #1. Consumer<T>
		// void java.util.function.Consumer.accept ( T t )
		Consumer<String> consumer = (t)->{System.out.println("hello "+t);};
		consumer.accept("bro");
	}
}
/*
 * 1. Consumer<T>	:	받는 용도 - accept
 * 2. Supplier<T>	:	제공 용도 - get
 * 3. Predicate<T>	:	판단 용도 - test
 * 4. Function<T,R>	:	처리 용도	- apply
 * 5. Operator<T>	: 	연산 용도 - apply
 */
