package subclasses;

import Main.Animal;

public class Gato extends Animal {

	public Gato() {}

	@Override
	public void gritar(){
        System.out.println("Miau, Miau!");
	}

}
