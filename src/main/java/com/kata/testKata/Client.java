package com.kata.testKata;

/**
 * Contains all informations of a bank client
 * @author Christian
 *
 */
public class Client {
	private String name;

	public Client(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
