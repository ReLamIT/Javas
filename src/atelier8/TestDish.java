package atelier8;
import static atelier8.Dish.menu;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class TestDish {
	


	 
	public static void main(String[] args) {
		   // 1- Filtrer les objets Dish de type « Vegetarian »
	    List<Dish> vegetarianDishes = menu.stream()
	            .filter(Dish::isVegetarian)
	            .toList();


	    // 2- Trier la liste des dishes, puis filtrer les objets Dish suivant Calories < 320
	    List<Dish> lowCalorieDishes = menu.stream()
	            .sorted((d1, d2) -> Integer.compare(d1.getCalories(), d2.getCalories()))
	            .filter(d -> d.getCalories() < 320)
	            .toList();


	    // 3- Utiliser la méthode takeWhile() pour filtrer la liste (Calories > 300)
	    List<Dish> takeWhileDishes = menu.stream()
	            .takeWhile(d -> d.getCalories() > 300)
	            .toList();


	    // 4- Utiliser la méthode dropWhile() pour filtrer la liste (Calories > 300)
	    List<Dish> dropWhileDishes = menu.stream()
	            .dropWhile(d -> d.getCalories() > 300)
	            .toList();


	    // 5- Filter la liste des objets Dish, puis utiliser la fonction skip
	    List<Dish> filteredAndSkippedDishes = menu.stream()
	            .filter(d -> d.getCalories() < 500)
	            .skip(1) 
	            .toList();


	    // 6- Utiliser la fonction anyMatch pour vérifier l’existence d’un objet Dish de type Vegetarian
	    boolean anyVegetarianDishExists = menu.stream()
	            .anyMatch(Dish::isVegetarian);


	    // 7- Utiliser la fonction allMatch pour s’assurer que tous les objets Dish ont des calories < 1000
	    boolean allDishesCaloriesUnder1000 = menu.stream()
	            .allMatch(d -> d.getCalories() < 1000);


	    // 8- Utiliser la fonction noneMatch pour s’assurer qu’aucun objet Dish n’a pas de calories >= 1000
	    boolean noDishWithCaloriesAbove1000 = menu.stream()
	            .noneMatch(d -> d.getCalories() >= 1000);


	    // 9- Soit la liste : List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);
	    // a. Calculer la somme de numbers
	    int sumOfNumbers = Arrays.asList(3, 4, 5, 1, 2).stream()
	            .reduce(0, Integer::sum);


	    // b. Renvoyer la valeur maximale de cette liste
	    Optional<Integer> maxNumber = Arrays.asList(3, 4, 5, 1, 2).stream()
	            .reduce(Integer::max);

	    // c. Renvoyer la valeur minimale de cette liste
	    Optional<Integer> minNumber = Arrays.asList(3, 4, 5, 1, 2).stream()
	            .reduce(Integer::min);


	    // 10- à l’aide de la fonction reduce, calculer la somme des calories de la liste menu
	    int totalCalories = menu.stream()
	            .map(Dish::getCalories)
	            .reduce(0, Integer::sum);

		
		
	}

}
