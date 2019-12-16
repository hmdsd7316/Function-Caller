package com.sid.FunctionCaller;

import com.sid.FunctionCaller.concrete.FunctionCaller;
import com.sid.FunctionCaller.interfaces.Caller;

public class Clients {
	public static void main(String[] args) throws Exception {
		Coders client = new Coders();
		MyProxy myProxy = new MyProxy();
		Caller caller = new FunctionCaller(myProxy);
		
		caller.task(()-> client.setName("Ahmad Sayeed"));
		caller.task(() -> client.setPassion("Problem Solving"));
		
		System.out.println("Name: " + caller.task(()-> client.getName()));
		System.out.println("Passion: " + caller.task(()-> client.getPassion()));
	}
}
