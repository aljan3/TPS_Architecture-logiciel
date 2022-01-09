package Receivers;

import java.util.List;

public class RemoteControl {
	int nbrslot ; 
	List<Device> devices ; 
	public int getNbrslot() {
		return nbrslot;
	}
	public void setNbrslot(int nbrslot) {
		this.nbrslot = nbrslot;
	}
	public List<Device> getDevices() {
		return devices;
	}
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	public RemoteControl(int nbrslot)
	{
		this.nbrslot= nbrslot;
	}
	public void init(List<Device> devices)
	{
		this.devices=devices ; 
	}

}
