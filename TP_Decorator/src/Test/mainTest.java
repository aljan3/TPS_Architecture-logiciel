package Test;

import ConcreteComposants.ConcreteAssurance;
import ConcreteComposants.Voiture;
import Decorateurs.DecorateurBrisDeGlace;

public class mainTest {

	public static void main(String[] args) {
		Voiture v1 = new ConcreteAssurance();
		v1.garantie();
		// 1 décoration 
		v1 = new DecorateurBrisDeGlace(v1); 
		v1.garantie();

	}

}
