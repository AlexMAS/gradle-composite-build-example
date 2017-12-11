package org.some.component1.services;

import org.some.component1.api.IService1;

public class Service1 implements IService1 {
	@Override
	public void invoke() {
		System.out.println("Hello, Component1!");
	}
}