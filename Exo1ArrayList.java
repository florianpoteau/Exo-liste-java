package ExoCollection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exo1ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Façon simple, array de type nombre
		
		String [] nombre = new String [3];
		
		nombre[0]= "Java";
		nombre[1] = "php";
		nombre[2] = "python";
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.println(i);
		}
		
		
		
		
//		façon array de type String
		
		String [] language = new String [] {"java", "python", "php"};
        System.out.println(Arrays.toString(language));
        
        
        
	
	
	 //ArrayList sans boucle
        
    List<String> listes = new ArrayList<String>(); 
    listes.add("python"); 
    listes.add("php"); 
    listes.add("java");
    System.out.println("ArrayList : " + listes);
    
    
    
    
//    ArrayList avec boucle
    
    System.out.println();
    for (int x = 0; x < listes.size(); x++) {
    	System.out.println(listes.get(x));
    	
    }
    
    
    
    
//    ArrayList pour ajouter une valeurs qui prend la première place
    
    List <String> langues2 = new ArrayList<String>();
    
    langues2.add("python");
    langues2.add("java");
    langues2.add("php");
    
    langues2.add(0, "Pascal");
    
    System.out.println(langues2);
    
    
    
    
//     Récupérer le troisième éléments a partir d'une arrayList
    
    List <String> langues3 = new ArrayList<String>();
    langues3.add("pascal");
    langues3.add("java");
    langues3.add("python");
    langues3.add("php");
    
    System.out.println();
    String lang = langues3.get(2);
    System.out.println("Le troisième élément est: " +lang);
    
    
    
    
//    Mettre a jour le 3 eme élément d'une liste
    
    List <String> langues4 = new ArrayList<String>();
    langues4.add("pascal");
    langues4.add("java");
    langues4.add("css");
    langues4.add("php");
    
    System.out.println();
    langues4.set(2, "COBOL");
    System.out.println(langues4);
	
	
//	Supprimer le 3 ème élément d'une ArrayList
    
    List <String> langues5 = new ArrayList <String>();
    langues5.add("Python");
    langues5.add("c++");
    langues5.add("java");
    langues5.add("Pascal");
    
    langues5.remove(2);
    
    System.out.println(langues5);
    
    
    
    
//    rechercher un élément dans une liste pour savoir si il existe
    
    List <String> langues6 = new ArrayList <String>();
    langues6.add("Python");
    langues6.add("c++");
    langues6.add("java");
    langues6.add("Pascal");
    
    if ( langues6.contains("java")){
    	System.out.println("Cette élément existe: " + langues6.get(2));
    }
    
    else {
    	System.out.println("Cette élément existe pas");
    }
	}
 }
