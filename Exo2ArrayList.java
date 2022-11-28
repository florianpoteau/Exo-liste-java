package ExoCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exo2ArrayList {

	public static void main(String[] args) {
		
		
//		Trier une liste
		
		List <String> list = new ArrayList();
		list.add("java");
		list.add("Python");
		list.add("c++");
		list.add("Pascal");
		System.out.println("liste avant le tri " +list);
		Collections.sort(list);
		System.out.println("liste après le tri" + list);
		System.out.println();
		
		
		
//		Inverser les éléments d'une liste
		
		List <String> list1 = new ArrayList();
		list1.add("Pascal");
		list1.add("C++");
		list1.add("java");
		list1.add("Python");
		
		System.out.println("avant d'inverser la liste: " +list1);
		Collections.reverse(list1);
		System.out.println("après: " + list1);
		System.out.println();
		
		
		
		
//		Copier une liste dans une autre
		
		List <String> list2 = new ArrayList();
		list2.add("Pascal");
		list2.add("C++");
		list2.add("java");
		list2.add("Python");
		
		System.out.println("languages: " +list2);
		
		
		List <String> list3 = new ArrayList();
		list3.add ("Symfony");
		list3.add("Spring");
		list3.add("hibernate");
		list3.add("Laravel");
		
		System.out.println("Frameworks: " + list3);
		
		Collections.copy(list2, list3);
		
		System.out.println("Copie....");
		System.out.println("languages: " +list2);
		System.out.println("Frameworks: " +list3);
		System.out.println();
		
		
		
		
//		Mélanger une liste d'élément
		
		List <String> list4 = new ArrayList<String>();
		list4.add("C++");
		list4.add("java");
		list4.add("Pascal");
		list4.add("Python");
		
		System.out.println("Liste avant de mélanger" + list4);
		Collections.shuffle(list4);
		System.out.println("Liste après mélange" + list4);
		System.out.println();
		
		
		
		
//		Extraire une partie d'une ArrayList
		
		List <Integer> list5 = new ArrayList <Integer>();
		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);
		list5.add(5);
		list5.add(6);
		list5.add(7);
		list5.add(8);
		list5.add(9);
		
		System.out.println("Avant extraction: " +list5);
		List <Integer> Extraction = list5.subList(4, 7);
		System.out.println("Après extraction: " +Extraction);
		System.out.println();
		
		
		
//		Augmenter la taille d'un ArrayList
		
		ArrayList <Integer> nbrs = new ArrayList <Integer>(4);
		nbrs.add(1);
		nbrs.add(2);
		nbrs.add(3);
		nbrs.add(4);
		nbrs.ensureCapacity(5);
		nbrs.add(6);
		nbrs.add(7);
		nbrs.add(8);
		nbrs.add(9);
		nbrs.add(10);
		
		System.out.println("ensureCapacity pour augmenter la taille de la liste " +nbrs);
		System.out.println();

		
		
		
//		Utiliser la boucle for each
		
		ArrayList <Integer> liste6 = new ArrayList <Integer>();
		int [] nombre = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i : nombre) {
			liste6.add(i);
		}
		
		System.out.println(liste6);
		
	}

}
