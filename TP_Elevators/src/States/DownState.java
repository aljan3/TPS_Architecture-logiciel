package States;

import Elevator.ConcreteElevator;

public class DownState extends ElevatorState {
	ConcreteElevator elevator ; 
	public DownState(ConcreteElevator elevator) {
		this.elevator=elevator;
	}

	@Override
	public int distance(int floor) {
		if(floor > elevator.getActualFloor())
			return floor + elevator.getTotalFloors() - elevator.getActualFloor();
		return elevator.getActualFloor()-floor; 
	}

	@Override
	public void down(){
		System.out.println("The elevator is alreay going down");
	}

	@Override
	public void up() {
		System.out.println("The elevator is  going down, it can't swith direction");
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
