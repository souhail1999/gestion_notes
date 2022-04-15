package gestoin_notes;

import java.util.Collections;

public class Main {
	public static void main(String[] args){
		etudiant e1=new etudiant(1,"hamid"),e2=new etudiant(2,"driss"),e3=new etudiant(1,"youssef");
		e1.changenote(15);e2.changenote(12);e3.changenote(16);
		listetudiants mesetudiants=new listetudiants();
		mesetudiants.add(e1);mesetudiants.add(e2);mesetudiants.add(e3);
		Collections.sort(mesetudiants);
		System.out.println(mesetudiants);
		System.out.println(mesetudiants.filtrer(e->e.getnote()>13));
		System.out.println("les eudiants qui ont rattrapage :"+mesetudiants.filtrer(e->e.getnote()<11));
		
		
	}
}