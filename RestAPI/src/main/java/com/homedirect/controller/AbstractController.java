package com.homedirect.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.homedirect.constant.ErrorCode;
import com.homedirect.entity.Page;
import com.homedirect.exception.ATMException;
import com.homedirect.response.ATMResponse;
import com.homedirect.support.ExecutionFunction;
import com.homedirect.support.ExecutionFunctions;
import com.homedirect.support.ExecutionSupplier;

// thêm log cho Exception
// sửa lại hàm ATMResponse
public abstract class AbstractController<P> {

	final Logger logger = Logger.getLogger(AbstractController.class);
	protected @Autowired P processor;

	protected <T, R> ATMResponse<R> apply(T t, ExecutionFunction<T, R> function) {
		try {
			R data = function.execute(t);
			return new ATMResponse<>(ErrorCode.SUCCESS, ErrorCode.SUCCESS_MES, data);
		} catch (ATMException e) {
			return new ATMResponse<>(e.getCode(), e.getMessage(), null);
		} catch (Throwable e) {
			return new ATMResponse<>(ErrorCode.UNKNOWN, e.getMessage(), null);
		}
	}
	
	protected <R> ATMResponse<R> apply(ExecutionSupplier<R> function) {
		try {
			R data = function.execute();
			return new ATMResponse<>(ErrorCode.SUCCESS, ErrorCode.SUCCESS_MES, data);
		} catch (ATMException e) {
			return new ATMResponse<>(e.getCode(), e.getMessage(), null);
		} catch (Throwable e) {
			return new ATMResponse<>(ErrorCode.UNKNOWN, e.getMessage(), null);
		}
	}
	
	protected <T, R> ATMResponse<Page<R>> applys(T t, ExecutionFunctions<T, R> function) {
		try {
			Page<R> data = function.execute(t);
			return new ATMResponse<>(ErrorCode.SUCCESS, ErrorCode.SUCCESS_MES, data);
		} catch (ATMException e) {
			return new ATMResponse<>(e.getCode(), e.getMessage(), null);
		} catch (Throwable e) {
			return new ATMResponse<>(ErrorCode.UNKNOWN, e.getMessage(), null);
		}
	}
}
