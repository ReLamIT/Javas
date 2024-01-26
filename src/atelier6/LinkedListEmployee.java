package atelier6;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEmployee {
	
	private LinkedList<Employe> employees = new LinkedList<Employe>();
	
	public void alimenterlinkedlist() {
		employees.addLast(new Employe("Lamrini", "Reda", "EUIZEI", 2000));
		employees.addLast(new Employe("Elboudadi", "Aymane", "DIER", 40000));
		employees.addLast(new Employe("Eddini", "Oussama", "ezhzei", 30000));
		employees.addLast(new Employe("Karim", "Adil", "ezeekzi", 20000));
	}
	
	public void displayemployees() {
		for (Employe e : employees) {
			System.out.println(e.toString());
		}
	}
	
	public void IteratorEmployees() {
		Iterator<Employe> EmpIter = employees.iterator();
		while (EmpIter.hasNext())
			System.out.println(EmpIter.next());
	}
	
	public void insertAtLast(Employe emp) {
		employees.addLast(emp);
	   
	}
	
	public void insertAtBegin(Employe emp) {
		employees.addFirst(emp);  
	}
	
	public void reverseIterator() {
		Iterator<Employe> iter = employees.descendingIterator();
		while (iter.hasNext())
			System.out.println(iter.next().toString());
	}
	
	public Employe insertAtNth(int pos,Employe emp) {
		if (pos >= 0 && pos < employees.size())
			employees.add(pos,emp);

		throw new IllegalArgumentException();
	}
	
	
	public Employe getEmploye(int pos) {
		if (pos >= 0 && pos < employees.size())
			return employees.get(pos);

		throw new IllegalArgumentException();
	}
	
	public void IteratorEmployees2() {
		Iterator<Employe> EmpIter = employees.iterator();
		int c=0;
		while (EmpIter.hasNext())
			System.out.println(c++ +" : "+EmpIter.next());
	}
	
	public void removeAllEmploye() {
		employees.clear();
	}
	
	public boolean removeEmploye(Employe emp) {
		return employees.remove(emp);
	}
	
	public void removeFirstLast() {
		employees.removeFirst();
		employees.pollLast();
	}
	
	public void swapEmploye(int elem1 , int elem2) {
		Collections.swap(employees, elem1, elem2);
	}
	
	public void shuffleEmploye() {
		Collections.shuffle(employees);
	}
	
	public void joinEmploye(LinkedList<Employe> emp) {
		employees.addAll(emp);
	}
	
	public LinkedList<Employe> cloneEmploye() {
		return new LinkedList<>(employees);
	}
	
	public Employe removeFirstEmp() {
		return employees.pollFirst();
	}
	
	public Employe peekFirstEmp() {
		return employees.peekFirst();
	}
	
	public Employe peekLastEmp() {
		return employees.peekLast();
	}
	
	public boolean searchEmploye(Employe emp) {
		return employees.contains(emp);
	}
	
	public Employe[] converttoArray() {
		return employees.toArray(new Employe[employees.size()]);
	}
	
	public boolean isSame(LinkedList<Employe> emp) {
		return employees.equals(emp);
	}
	
	public boolean isEmptyEmployees() {
		return employees.isEmpty();
	}
	
	public void replacEmploye(Employe emp,int pos) {
		if (pos >= 0 && pos < employees.size()) {
	      employees.set(pos, emp);
		}
	}
	
	
	
	
	
	


}
