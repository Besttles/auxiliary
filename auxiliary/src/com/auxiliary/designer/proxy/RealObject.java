package com.auxiliary.designer.proxy;

public class RealObject implements Interface{

	@Override
	public void doSomething() {
		System.out.println("dosomething");
	}

	@Override
	public void someThingElse( String args) {
		System.out.println("doSomething"+args);
	}
}
