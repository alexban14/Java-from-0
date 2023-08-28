public interface CheckTrait {
	boolean test(Animal a);
}

// without a Lambda we need to write a separate class for every animal property check
public class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}

