package States;

import Elevator.ConcreteElevator;

public class UPState extends ElevatorState {

	ConcreteElevator elevator ; 
	public UPState(ConcreteElevator elevator) {
		this.elevator=elevator;
	}

	@Override
	public int distance(int floor) {
		if(floor>=elevator.getActualFloor())
			return floor-elevator.getActualFloor();
		else 
			return floor + elevator.getTotalFloors()- elevator.getActualFloor();
	}

	@Override
	public void down(){
		elevator.ChangeState(new DownState(elevator));
	}

	@Override
	public void up() {
		System.out.println("The elevator is already going up");
	}

	@Override
	public void rest() {
		elevator.ChangeState(new RestState(elevator));
		
	}

	@Override
	public void stop() {
		elevator.ChangeState(new StopState(elevator));
		
	}	
	
}
