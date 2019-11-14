package fr.wembergy.miage.m1.monHelloWorld;

import java.util.Scanner;

public class Hello {
	
	final String MESSAGE = "BONJOUR LE MONDE !";
	private String chaine;
	
	public void afficheur(String chaine) {
		System.out.println(MESSAGE + " - " + chaine);
	}
	
	public String getChaine() {
		return chaine;
	}
	
	public void setChaine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez renseigner la phrase à concaténer :");
		String str = sc.nextLine();
		sc.close();
		this.chaine = str;
	}
	

}
