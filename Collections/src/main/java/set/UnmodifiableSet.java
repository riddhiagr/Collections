package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSet {

	public static void main(String args[]) {
		
		final Set<String> set = new HashSet<>();
		set.add("Riddhi");
		set.add("Anki");
		final Set<String> _cmTickerTradeSrc =  Collections.unmodifiableSet(set);
		NewUmModifiableSet unmodifiableSet = new NewUmModifiableSet(_cmTickerTradeSrc);
		unmodifiableSet.changeSet("Singh");
		System.out.println(unmodifiableSet.set.toString());
	}
}
