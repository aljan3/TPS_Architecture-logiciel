package Observable;

public class ServiceComptable {
	
	public boolean verify(int MontantAchat, departement d)
	{
		if(MontantAchat<= d.budget)
		{
			d.blocked=MontantAchat; 
			d.notifierPO( MontantAchat);
			return true ; 
		}
		return false; 
	}

}
