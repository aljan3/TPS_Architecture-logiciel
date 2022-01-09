package Elevator;

import States.ElevatorState;

public interface Elevator {
	public  void down();
	public  void up();
	public  void rest();
	public  void stop();
	public void ChangeState(ElevatorState ES);
	public int distance(int floor);

}
