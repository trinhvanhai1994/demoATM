package com.homedirect.support;

import com.homedirect.entity.Page;
public interface ExecutionFunctions<T, R> {

	Page<R> execute(T t);
}
