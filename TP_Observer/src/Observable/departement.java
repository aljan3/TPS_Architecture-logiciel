package Observable ;

import Observers.IServiceGestionPatr;

public class departement {
	int budget ; 
	int blocked ; 
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getBlocked() {
		return blocked;
	}
	public void setBlocked(int blocked) {
		this.blocked = blocked;
	}
	IServiceGestionPatr gp ; 
	
	public departement(int budget, IServiceGestionPatr gp )
	{
		this.budget=budget ; 
		this.gp=gp;
	}
	public void notifierPO(int montantAchat)
	{
		this.gp.updateBudget(montantAchat);
	}
	

}
