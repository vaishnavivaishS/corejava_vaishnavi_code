package org.tnsif.sf.c2tc.oops;

public class FoodItems {

	String name;
	double price;
	String category;
	
	void displayDetailes()
	{
		System.out.println("Food Name:"+name);
		System.out.println("Food price:"+price);
		System.out.println("Food category:"+category);
		System.out.println("...........");
		
	}
	
	public static void main(String[] args) {
		FoodItems obj = new FoodItems();
		obj.name="burger";
		obj.price=50.20;
		obj.category="fast food";
		
		FoodItems obj1 = new FoodItems();
		obj1.name="paneer pizza";
		obj1.price=100.60;
		obj1.category="italian";
		
		obj.displayDetailes();
		obj1.displayDetailes();

	}

}
