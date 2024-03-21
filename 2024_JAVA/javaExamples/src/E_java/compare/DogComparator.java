package E_java.compare;

import java.util.Comparator;

import obj.Dog;

public class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.weight- o2.weight;
	}

}