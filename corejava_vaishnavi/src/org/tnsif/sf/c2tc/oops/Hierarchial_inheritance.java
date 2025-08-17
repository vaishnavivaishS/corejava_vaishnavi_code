package org.tnsif.sf.c2tc.oops;

class Employee
{
	void company()
	{
		System.out.println("Company :Tnsif");
	}
}
class Developer extends Employee
{
	void role()
	{
		System.out.println("Role :Software Developer");
		
	}
}
class Tester extends Employee
{
	void role() {
		System.out.println("Role :QA Tester");
	}
}

public class Hierarchial_inheritance {

	public static void main(String[] args) {
		Developer dev=new Developer();
		Tester test=new Tester();
		
		dev.company();
		dev.role();
		
		test.company();
		test.role();

	}

}
