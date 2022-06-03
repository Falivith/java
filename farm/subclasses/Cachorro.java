package subclasses;

import Main.Animal;

public class Cachorro extends Animal {

	public Cachorro() {}

	@Override
	public void gritar(){
        System.out.println("Au, Au, Au!");
	}

}
