package com.homedirect.support;

@FunctionalInterface
public interface ExecutionFunction<T, R> {
	R execute(T t);
}