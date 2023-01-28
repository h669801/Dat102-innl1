package no.hvl.data102.adt;

import java.util.Scanner;
import no.hvl.data102.klient.*;
import no.hvl.data102.*;

public class Tekstgrensesnitt {
	
	public static void main(String[] args) {
		
	}

	// lese opplysningene om en FILM fra tastatur  
	 public Film lesFilm(){ 
	  // TODO 
	  return null; 
	 } 
	 
	 // vise en film med alle opplysninger på skjerm (husk tekst for sjanger) 
	 public void visFilm(Film film) { 
	  // TODO 
	 } 
	 
	 // Skrive ut alle Filmer med en spesiell delstreng i tittelen 
	 public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,  
	                                                           String delstreng) { 
	  // TODO 
		 
		 String f = filma.toString();
		 if (f.contains(delstreng)) {
			 System.out.println(f);
		 }
		 
//		 Scanner filma = new Scanner(System.in);  // Create a Scanner object
//		 System.out.println("Søk etter film: ");
//
//		 String i = filma.nextLine();  // Read user input
//		 System.out.println("Filmer : " + i.contains(delstreng));  // Output user input
	 } 
	 
	 // Skriver ut alle Filmer av en produsent / en gruppe 
	 public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) { 
	  // TODO Denne gjør tilsvarende som metoden over 
	 } 
	 
	 // Skrive ut en enkel statistikk som inneholder antall Filmer totalt 
	 // og hvor mange det er i hver sjanger 
	 public void skrivUtStatistikk(FilmarkivADT filma) { 
	  // TODO 
	 } 
	 // ... Ev. andre metoder 
	 
	}


