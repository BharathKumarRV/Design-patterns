package com.designpatterns.Design.patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	String name;

	public Composite(String name) {
		super();
		this.name = name;
	}

	List<Component> components = new ArrayList<>();

	public void addComponent(Component com) {
		components.add(com);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for (Component c : components) {
			c.showPrice();
		}

	}

}
