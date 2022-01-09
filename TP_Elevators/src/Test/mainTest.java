package Test;

import Elevator.ConcreteElevator;
import Elevator.Elevator;
import States.DownState;
import States.UPState;

public class mainTest {

	public static void main(String[] args) {
		
		ConcreteElevator e1 = new ConcreteElevator(1,4,10);
		ConcreteElevator e2 = new ConcreteElevator(2,5,10);	
		e1.setES(new DownState(e1));
		e2.setES(new UPState(e2));
		
		if(e1.distance(5)<e2.distance(5))
		{
			System.out.println("The Elevator that will be served is elevator " + e1.getIdElevator());
		}
		else 
		{
			System.out.println("The Elevator that will be served is elevator " + e2.getIdElevator());
		}
		
		
		// TODO Auto-generated method stub

	}

}
