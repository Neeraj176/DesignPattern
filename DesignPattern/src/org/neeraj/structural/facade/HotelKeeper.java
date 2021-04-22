package org.neeraj.structural.facade;

public class HotelKeeper{
    
	public VegMenu getVegMenu(){
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
    }
      
    public NonVegMenu getNonVegMenu(){
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus();
        return NonvegMenu;
    }
      
    public BothMenu getVegNonMenu(){
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        BothMenu bothMenu = (BothMenu)v.getMenus();
        return bothMenu;
    }    
}
