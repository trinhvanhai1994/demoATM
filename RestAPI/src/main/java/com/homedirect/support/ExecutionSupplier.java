package com.homedirect.support;

@FunctionalInterface
public interface ExecutionSupplier<R> {
	R execute();
}
