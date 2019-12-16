package com.sid.FunctionCaller;

import com.sid.FunctionCaller.interfaces.FunctionProxy;

public class MyProxy implements FunctionProxy {

	@Override
	public void before() {
		System.out.println("@Before of every method call");

	}

	@Override
	public void after() {
		System.out.println("@After of every method call");

	}
}
