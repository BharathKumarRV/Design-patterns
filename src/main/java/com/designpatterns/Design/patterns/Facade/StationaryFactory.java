package com.designpatterns.Design.patterns.Facade;

public class StationaryFactory {

	public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
