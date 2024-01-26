package atelier9;

import java.util.ArrayList;

public class FileAttente<T> {

	protected ArrayList<T> contenu;

	public FileAttente() {
		contenu = new ArrayList<T>();
	}

	public void entre(T t) {
		contenu.add(t);
	}

	public T sort() {
	    T t = null;
		if (!contenu.isEmpty()) {
			t = contenu.get(contenu.size() - 1);
			contenu.remove(contenu.size() - 1);
		}
		return t;
	}

	public boolean estVide() {
		return contenu.isEmpty();
	}

	public String toString() {
		return "" + contenu;
	}

}
