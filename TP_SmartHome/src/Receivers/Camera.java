package Receivers;

public class Camera implements Device {

	@Override
	public void On() {
		System.out.println("Camera is on");
		
	}

	@Override
	public void Off() {
		System.out.println("Camera is off");
		
	}

}
