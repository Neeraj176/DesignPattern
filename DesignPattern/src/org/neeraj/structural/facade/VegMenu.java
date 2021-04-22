package org.neeraj.structural.facade;

public class VegMenu implements Menus{

	@Override
	public Menus getMenu() {
		return new VegMenu();
	}

	
}
