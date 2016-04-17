package iterator_j8;

public class Predicate implements IPredicate<Integer>{

	@Override
	public boolean test(Integer t) {
		if(t>2){
			return true;
		}
		return false;
	}

}
