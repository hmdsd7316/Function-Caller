package com.sid.FunctionCaller.concrete;

import java.util.concurrent.Callable;

import com.sid.FunctionCaller.interfaces.Caller;
import com.sid.FunctionCaller.interfaces.FunctionProxy;

public class FunctionCaller implements Caller{
	
	private FunctionProxy functionProxy;
	
	public FunctionCaller(FunctionProxy functionProxy){
		this.functionProxy = functionProxy;
	}
	
	public <T> T task(Callable<T> task) throws Exception {
		this.functionProxy.before();
		T call = task.call();
		this.functionProxy.after();
		return call;
	}

	public <T> void task(Runnable aMethod) {
		this.functionProxy.before();
		aMethod.run();
		this.functionProxy.after();
	}	
}
