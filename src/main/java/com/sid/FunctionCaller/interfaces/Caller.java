package com.sid.FunctionCaller.interfaces;

import java.util.concurrent.Callable;

public interface Caller {
	public <T> T task(Callable<T> task) throws Exception;
	
	public <T> void task(Runnable aMethod);
	
}
