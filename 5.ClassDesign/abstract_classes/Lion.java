public abstract class Animal {
	public abstract String getName();
}

public abstract class BigCat extends Animal {
	public String getName() {
		return "BigCat";
	}
	public abstract void roar();
}

public class Lion extends BigCat {
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}
