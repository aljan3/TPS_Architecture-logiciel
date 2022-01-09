package States;

import Elevator.ConcreteElevator;

public class StopState extends ElevatorState {

	ConcreteElevator elevator ; 
	public StopState(ConcreteElevator elevator) {
		this.elevator=elevator;
	}

	@Override
	public int distance(int floor) {
		return -1;
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
		elevator.ChangeState(new RestState(elevator));
		
	}

	@Override
	public void stop() {
		System.out.println("the elevator is already stopped");
		
	}	

}
