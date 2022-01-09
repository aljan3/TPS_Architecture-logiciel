package Commands;

import Receivers.Device;

public class Off_Command implements ICommand {
	Device device ; 
	public Off_Command(Device device)
	{
		this.device=device ; 
	}
	@Override
	public void execute() {
		this.device.Off();
		
		
	}

	@Override
	public void unexecute() {
		this.device.On();
		
	}
}