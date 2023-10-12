package lecturejava;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Personne p=new Personne();
		System.out.println("donner le nom");
		p.setNom(sc.nextLine());
		System.out.println("donner le prénom");
p.setPrenom(sc.nextLine());
		System.out.println("donner l'age");
		p.setAge(sc.nextInt());



System.out.println(p.toString());

System.out.println("donner le titre du produit");
String titre=sc.nextLine();
System.out.println("donner la description");
String description=sc.nextLine();
System.out.println("donner le prix unitaire");
double prix=sc.nextDouble();
System.out.println("donner la quantité");
int quantite=sc.nextInt();
Produit pr=new Produit(titre, description, prix, quantite);
System.out.println(pr.toString());



		
	}

}
