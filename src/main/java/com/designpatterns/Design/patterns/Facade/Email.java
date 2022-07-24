package com.designpatterns.Design.patterns.Facade;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
