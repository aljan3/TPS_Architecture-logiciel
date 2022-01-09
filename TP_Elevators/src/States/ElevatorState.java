package States;


public abstract class ElevatorState {
	public abstract  void down();
	public abstract  void up();
	public abstract  void rest();
	public abstract  void stop();
	public abstract int distance(int floor);


}
