package no.hvl.data102.adt;

import no.hvl.data102.klient.*;
import no.hvl.dat102.adt.BagADT;
import no.hvl.dat102.bagklient.Person;
import no.hvl.dat102.tabell.TabellBag;
import no.hvl.data102.*;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;

	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}
	
//	public static void main(String[] args) {
//		start();
//	}

	public void start() {
		// legg inn en del forhåndsdefinerte filmer for å teste metodene
		// TODO
		Film film[] = { new Film ( 1, "Thomas", "film1", 1990, "warner"), new Film ( 2, "Thomas F", "film2", 1992, "warner P"), new Film ( 3, "Thomas A", "film3", 1996, "warner R")};
//		System.out.println(film);
//		
//		FilmarkivADT<film> filmarkiv = new Meny<>(5);
		// Legger til personer
		for (int i = 0; i < film.length; i++) {
			filmarkiv.leggTilFilm(film[i]);
		}
		System.out.println(filmarkiv);
		
		// Skriver ut samlingen
		//((Meny) filmarkiv).skriv();
//		Film(int filmnr, String produsent, String tittel, int årstall, String filmselskap) {
	}

}
