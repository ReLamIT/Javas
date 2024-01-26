package atelier6;

import java.util.Comparator;

public class CmpPrenom implements Comparator<Employe> {
	
	public int compare(Employe o1 , Employe o2) {
		return o1.getPrenom().compareTo(o2.getPrenom());
	}

}
