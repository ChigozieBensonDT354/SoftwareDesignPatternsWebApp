package com.example.softwarePatterns;

public abstract class Decorator implements UserType{
	
	protected UserType decoratedUser;

	public Decorator(UserType decoratedUser) {
		this.decoratedUser = decoratedUser;
	}

	public String login() {
		return decoratedUser.login();
	}
}
