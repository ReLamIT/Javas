package atelier6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListEmployees {

	private ArrayList<Employe> employees = new ArrayList<Employe>();

	public void alimenterListe() {
		employees.add(new Employe("Lamrini", "Reda", "EUIZEI", 2000));
		employees.add(new Employe("Elboudadi", "Aymane", "DIER", 40000));
		employees.add(new Employe("Eddini", "Oussama", "ezhzei", 30000));
		employees.add(new Employe("Karim", "Adil", "ezeekzi", 20000));
	}

	public void displayemployees() {
		for (Employe e : employees) {
			System.out.println(e.toString());
		}
	}

	public void Iteratoremployees() {
		Iterator<Employe> EmpIter = employees.iterator();
		while (EmpIter.hasNext())
			System.out.println(EmpIter.next().toString());
	}

	public void insertAtBegin(Employe emp) {
		employees.add(0, emp);
	}

	public Employe getEmploye(int pos) {
		if (pos >= 0 && pos < employees.size())
			return employees.get(pos);

		throw new IllegalArgumentException();
	}
	
	public void UpdateEmploye(Employe emp,int pos) {
		if (pos >= 0 && pos < employees.size()) {
	      employees.set(pos, emp);
		}
	}

	public boolean removeEmploye(Employe emp) {
		return employees.remove(emp);
	}
	

	public boolean searchEmploye(Employe emp) {
		return employees.contains(emp);
	}

	public void sortEmploye(Comparator<Employe> cmp) {
		employees.sort(cmp);
	}

	public ArrayList<Employe> copyEmploye() {
		return new ArrayList<>(employees);
	}

	public void shuffleEmploye() {
		Collections.shuffle(employees);
	}

	public void reversEmploye() {
		Collections.reverse(employees);
	}

	public ArrayList<Employe> subEmploye(int start, int end) {
		if (start >= 0 && end < employees.size())
			return (ArrayList<Employe>) employees.subList(start, end);

		throw new IllegalArgumentException();

	}
	
	public boolean isSame(ArrayList<Employe> Emp) {
	    return employees.equals(Emp);
	}
	
	public void swapEmploye(int elem1 , int elem2) {
		Collections.swap(employees, elem1, elem2);
	}
	
	public void clearEmployees() {
		employees.clear();
	}
	
	public boolean isEmptyEmployees() {
		return employees.isEmpty();
	}
	
	

}
