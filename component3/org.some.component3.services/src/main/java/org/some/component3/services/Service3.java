package org.some.component3.services;

import org.some.component3.api.IService3;

public class Service3 implements IService3 {
	@Override
	public void invoke() {
		System.out.println("Hello, Component3!");
	}
}