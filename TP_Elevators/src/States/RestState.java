package States;

import Elevator.ConcreteElevator;

public class RestState extends ElevatorState {

	ConcreteElevator elevator ; 
	public RestState(ConcreteElevator elevator) {
		this.elevator=elevator;
	}

	@Override
	public int distance(int floor) {
		return Math.abs(floor - elevator.getActualFloor()); 
	}

	@Override
	public void down(){
		elevator.ChangeState(new DownState(elevator));
	}

	@Override
	public void up() {
		elevator.ChangeState(new UPState(elevator));
	}

	@Override
	public void rest() {
		System.out.println("The elevator is already resting");
		
	}

	@Override
	public void stop() {
		elevator.ChangeState(new StopState(elevator));;
		
	}	

}
