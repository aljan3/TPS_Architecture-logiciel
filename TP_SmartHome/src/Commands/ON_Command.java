package Commands;

import Receivers.Device;

public class ON_Command implements ICommand {
	Device device ; 
	public ON_Command(Device device)
	{
		this.device=device ; 
	}
	@Override
	public void execute() {
		this.device.On();
		
		
	}

	@Override
	public void unexecute() {
		this.device.Off();
		
	}

}
