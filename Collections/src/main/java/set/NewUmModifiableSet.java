package set;

import java.util.HashSet;
import java.util.Set;

public class NewUmModifiableSet {

	 Set<String> set;
	public NewUmModifiableSet(Set<String> set) {
		this.set = new HashSet<>(set);
	}
	
	public void changeSet(String val) {
		this.set.add(val);
	}
}
