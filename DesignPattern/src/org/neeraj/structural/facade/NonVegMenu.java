package org.neeraj.structural.facade;

public class NonVegMenu implements Menus{

	@Override
	public Menus getMenu() {
		return new NonVegMenu();
	}

}
