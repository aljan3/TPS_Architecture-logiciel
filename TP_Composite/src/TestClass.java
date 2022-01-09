
public class TestClass {

	public static void main(String[] args) {
		Categorie c1 = new Categorie("c1");
		Categorie c2 = new Categorie("c2");
		Component p2 = new Product("p2");
		c2.addComponent(p2);
		Component p1 = new Product("p1");
		c1.addComponent(p1);
		c1.addComponent(c2);
		c1.view();

	}

}
