package org.some.component2.services;

import org.some.component2.api.IService2;

public class Service2 implements IService2 {
	@Override
	public void invoke() {
		System.out.println("Hello, Component2!");
	}
}