package org.neeraj.structural.facade;

public class Client{
    public static void main (String[] args){
        HotelKeeper keeper = new HotelKeeper();
          
        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        BothMenu both = keeper.getVegNonMenu();
  
        System.out.println("Veg Menu" + v);
        System.out.println("Non Veg Menu" + nv);
        System.out.println("Veg Non-Veg Menu" + both);
    }
}