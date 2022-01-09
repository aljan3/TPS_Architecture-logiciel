package Receivers;

public class TV implements Device{

	@Override
	public void On() {
		System.out.println("The Tv is on");
		
	}

	@Override
	public void Off() {
		System.out.println("The Tv is off");
		
	}
	

}
