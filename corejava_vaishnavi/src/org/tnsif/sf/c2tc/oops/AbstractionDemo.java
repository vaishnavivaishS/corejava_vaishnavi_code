package org.tnsif.sf.c2tc.oops;

public class AbstractionDemo {

	public static void main(String[] args) {
		Mani obj=new Suresh();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealthMonitoring();
	}

}
abstract class Mani
{
	public void calling()
	{
		System.out.println("calling");
	}
	public abstract void AIIntegration();
	public abstract void SatelliteComm();
	public abstract void HealthMonitoring();
	
}
abstract class Ramu extends Mani
{

	@Override
	public void AIIntegration() {
		System.out.println("Phone is integrated with AI");
		
	}

	public abstract void SatelliteComm();
	public abstract void HealthMonitoring();
	
}
class Suresh extends Ramu
{

	@Override
	public void SatelliteComm() {
		System.out.println("Phone is integrated with SatelliteComm");
		
	}

	@Override
	public void HealthMonitoring() {
		System.out.println("PHone is integrated with HealthMonitoring ");
		
	}
}

