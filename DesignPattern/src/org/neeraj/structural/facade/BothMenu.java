package org.neeraj.structural.facade;

public class BothMenu implements Menus{

	@Override
	public Menus getMenu() {
		return new BothMenu();
	}

}
