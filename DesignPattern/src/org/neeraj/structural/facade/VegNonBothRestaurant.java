package org.neeraj.structural.facade;

public class VegNonBothRestaurant implements Hotel{
    
	public Menus getMenus(){
        BothMenu b = new BothMenu();
        return b;
    }
}
