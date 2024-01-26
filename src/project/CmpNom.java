package project;

import java.util.Comparator;

public class CmpNom implements Comparator<Knight> {

	@Override
	public int compare(Knight o1, Knight o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
