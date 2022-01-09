package Observers;

import Observable.departement;

public class ServiceGestionPatrImpl implements IServiceGestionPatr{
	departement dp ; 
	public ServiceGestionPatrImpl(departement dp)
	{
		this.dp=dp ; 
	}
	@Override
	public void updateBudget(int Montant) {
		this.dp.setBlocked(0);
		this.dp.setBudget(dp.getBudget()-Montant);
	}

}
