package com.github.designpattern.proxy;

public class Proxy implements Subject {

	private Subject subject;

	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		this.subject.request();
	}

}
