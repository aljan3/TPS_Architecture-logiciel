import java.util.ArrayList;
import java.util.List;

public class Categorie implements  Component{
	String name ; 
	
	public Categorie(String name)
	{
		this.name=name ; 
	}
	List<Component> c = new ArrayList<Component>();
	public void addComponent(Component p)
	{
		c.add(p);
	}
	public void view()
	{	String content="" ; 
		for(Component component : c)
		{
			content = this.name+"    "+ "has" + "    "+component.getName() ; 
		}
		System.out.println( content); 
	}
	public void delete(String name)
	{
		for(Component component : c)
		{
			if(component.getName()==name)
			{
				c.remove(component);
			}
		}
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	

}
