package atelier6;

import java.util.Comparator;

public class CmpSalaire implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		
		return (int) (o1.getSalaire()-o2.getSalaire());
	}

}
