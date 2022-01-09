
public class Product implements Component {
	int price ;
	String nameProduct ; 
	public Product(String name )
	{
		this.nameProduct=name ; 
	}
	public String getNameProduct()
	{
		return nameProduct ; 
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nameProduct;
	}
	

}
