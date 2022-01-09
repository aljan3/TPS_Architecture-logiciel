package Elevator;

import States.ElevatorState;

public class ConcreteElevator implements Elevator {
	ElevatorState ES ; 
	int idElevator;
	public ConcreteElevator(int idElevator,int ActualFloor, int TotalFloors)
	{
		this.idElevator=idElevator;
		this.ActualFloor=ActualFloor; 
		this.TotalFloors=TotalFloors; 
	}
	public ElevatorState getES() {
		return ES;
	}
	public void setES(ElevatorState eS) {
		ES = eS;
	}
	int ActualFloor; 
	int TotalFloors; 
	public int getIdElevator() {
		return idElevator;
	}
	public void setIdElevator(int idElevator) {
		this.idElevator = idElevator;
	}
	public int getActualFloor() {
		return ActualFloor;
	}
	public void setActualFloor(int actualFloor) {
		ActualFloor = actualFloor;
	}
	public int getTotalFloors() {
		return TotalFloors;
	}
	public void setTotalFloors(int totalFloors) {
		TotalFloors = totalFloors;
	}
	
	@Override
	public void down() {
		this.ES.down();
		
		
	}

	@Override
	public void up() {
		this.ES.up();
		
	}

	@Override
	public void rest() {
		this.ES.rest();
		
	}

	@Override
	public void stop() {
		this.ES.stop();
		
	}
	@Override
	public void ChangeState(ElevatorState ES) {
		this.ES= ES ; 
		
	}
	@Override
	public int distance(int floor) {
		return this.ES.distance(floor);
	}

}
