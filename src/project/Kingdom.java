package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Kingdom {
	
	/*
	 * Tableau
	 * 
	 * private Knight [] knights = new Knight[4];

	public Kingdom() {
		knights[0] = new Knight("yassine",100,130,new Weapon(30,"sword"));
		knights[1] = new Knight("reda",150,200,new Weapon(30,"guns"));
		knights[2] = new Knight("yassir",200,102,new Weapon(30,"arc"));
		knights[3] = new Knight("scorpion",300,290,new Weapon(30,"shield of fire"));
	}
	
	public void sort() {
		Arrays.sort(knights, new CmpNom());
	}
	
	public void add(Knight k) {
		List<Knight> list = Arrays.asList(knights);
		list.add(k);
		knights = list.toArray(new Knight[list.size()]);
	}
	
	public boolean existKnight(Knight k) {
		for(Knight kn : knights) 
			if(k.equals(kn)) return true;
		return false;
	}
	
	public boolean supprimerKnight(Knight k) {
		if(this.existKnight(k)) {
			List<Knight> list = Arrays.asList(knights);
			list.remove(k);
			knights = list.toArray(new Knight[list.size()]);
            return true;
		}
		return false;
	}
	
	public int howmanyknight() {
		return knights.length;
	}
	
	public void reverseTable() {
		List<Knight> list = Arrays.asList(knights);
		Collections.reverse(list);
		knights = list.toArray(new Knight[list.size()]);
	}
	
	public void displayKnights() {
		for(int i=0;i<knights.length;i++) {
			System.out.println(knights[i].toString());
		}
	}
	
	public Knight PowerfulKnight() {
		Arrays.sort(knights, new CmpHealth());
		return knights[knights.length-1];
	}
	
	public boolean equalKnight(Knight[] tknight) {
		return Arrays.equals(this.knights, tknight);
	}*/
	
	/**
	 **
	 *ArrayList
	 *
	 *private ArrayList<Knight> knights = new ArrayList<Knight>();
	
	
	
	public void alimenter() {
		knights.add(new Knight("yassine",100,130,new Weapon(30,"sword")));
		knights.add(new Knight("reda",150,200,new Weapon(30,"guns")));
		knights.add(new Knight("yassir",200,102,new Weapon(30,"arc")));
		knights.add(new Knight("scorpion",300,290,new Weapon(30,"shield of fire")));
	}
	   public void afficher() {
	        for (Knight knight : knights) {
	            System.out.println(knight);
	        }
	    }

	    public void parcourirAvecIterateur() {
	        Iterator<Knight> iterator = knights.iterator();
	        while (iterator.hasNext()) {
	            Knight knight = iterator.next();
	            System.out.println(knight);
	        }
	    }

	    public void insererEnPremierePosition(Knight knight) {
	        knights.add(0, knight);
	    }

	    public Knight recupererEmploye(int index) {
	        if (index >= 0 && index < knights.size()) {
	            return knights.get(index);
	        }
	        return null;
	    }

	    public void mettreAJourEmploye(int index, Knight updatedKnight) {
	        if (index >= 0 && index < knights.size()) {
	            knights.set(index, updatedKnight);
	        }
	    }

	    public void supprimerEmploye(Knight knight) {
	        knights.remove(knight);
	    }

	    public Knight rechercherEmploye(String name) {
	        for (Knight knight : knights) {
	            if (knight.getName().equals(name)) {
	                return knight;
	            }
	        }
	        return null;
	    }

	    public void trierListe() {
	        knights.sort((k1, k2) -> k1.getName().compareToIgnoreCase(k2.getName()));
	    }

	    public List<Knight> copierListe() {
	        return new ArrayList<>(knights);
	    }

	    public void melangerListe() {
	        java.util.Collections.shuffle(knights);
	    }

	    public void inverserElements() {
	        java.util.Collections.reverse(knights);
	    }

	    public List<Knight> extrairePartie(int fromIndex, int toIndex) {
	        return new ArrayList<>(knights.subList(fromIndex, toIndex));
	    }

	    public boolean comparerListes(List<Knight> otherList) {
	        return knights.equals(otherList);
	    }

	    public void echangerElements(int index1, int index2) {
	        java.util.Collections.swap(knights, index1, index2);
	    }

	    public void viderListe() {
	        knights.clear();
	    }

	    public boolean estVide() {
	        return knights.isEmpty();
	    }
	    */
	
	//LinkedList
	    private LinkedList<Knight> knightsList = new LinkedList<>();

	    public void alimenter() {
	        knightsList.add(new Knight("Yassine", 100, 130, new Weapon(30, "Sword")));
	        knightsList.add(new Knight("Reda", 150, 200, new Weapon(30, "Guns")));
	        knightsList.add(new Knight("Yassir", 200, 102, new Weapon(30, "Arc")));
	        knightsList.add(new Knight("Scorpion", 300, 290, new Weapon(30, "Shield of Fire")));
	    }

	    public void afficher() {
	        for (Knight knight : knightsList) {
	            System.out.println(knight);
	        }
	    }

	    public void parcourirAvecIterateur() {
	        ListIterator<Knight> iterator = knightsList.listIterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

	    public void insererAuDebut(Knight knight) {
	        knightsList.addFirst(knight);
	    }

	    public Knight recupererAuIndex(int index) {
	        if (index >= 0 && index < knightsList.size()) {
	            return knightsList.get(index);
	        }
	        return null;
	    }

	    public void mettreAJourAuIndex(int index, Knight updatedKnight) {
	        if (index >= 0 && index < knightsList.size()) {
	            knightsList.set(index, updatedKnight);
	        }
	    }

	    public void supprimerKnight(Knight knight) {
	        knightsList.remove(knight);
	    }

	    public void rechercherKnight(Knight knight) {
	        int index = knightsList.indexOf(knight);
	        if (index != -1) {
	            System.out.println("Knight found at index: " + index);
	        } else {
	            System.out.println("Knight not found");
	        }
	    }

	    public void trierListe() {
	        knightsList.sort((k1, k2) -> k1.getName().compareTo(k2.getName()));
	    }

	    public LinkedList<Knight> copierListe() {
	        return new LinkedList<>(knightsList);
	    }

	    public void melangerListe() {
	        Collections.shuffle(knightsList);
	    }

	    public void inverserListe() {
	        Collections.reverse(knightsList);
	    }

	    public LinkedList<Knight> extrairePartieListe(int fromIndex, int toIndex) {
	        if (fromIndex >= 0 && toIndex <= knightsList.size() && fromIndex <= toIndex) {
	            return new LinkedList<>(knightsList.subList(fromIndex, toIndex));
	        }
	        return new LinkedList<>();
	    }

	    public boolean comparerListes(LinkedList<Knight> otherList) {
	        return knightsList.equals(otherList);
	    }

	    public void echangerDeuxElements(int index1, int index2) {
	        if (index1 >= 0 && index2 >= 0 && index1 < knightsList.size() && index2 < knightsList.size()) {
	            Collections.swap(knightsList, index1, index2);
	        }
	    }

	    public void viderListe() {
	        knightsList.clear();
	    }

	    public boolean estVide() {
	        return knightsList.isEmpty();
	    }
	
	
	
	
	
	
	
	
	
	
	

}
