package no.hvl.data102.adt;

import no.hvl.data102.klient.*;
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
		Film film1 = new Film ( 1, "Thomas", "film1", 1990, "Warner A", Sjanger.DOCUMENTARY); 
		filmarkiv.leggTilFilm(film1);
		
		Film film2 = new Film ( 2, "Thomas F", "film2", 1992, "Warner P" , Sjanger.ACTION);
		filmarkiv.leggTilFilm(film2);
		
		Film film3 = new Film ( 3, "Thomas A", "film3", 1996, "Warner Y", Sjanger.DRAMA);
		filmarkiv.leggTilFilm(film3);
//		System.out.println(film);
//		
//		FilmarkivADT<film> filmarkiv = new Meny<>(5);
		// Legger til personer
//		for (int i = 0; i < film.length; i++) {
//			filmarkiv.leggTilFilm(film[i]);
//		System.out.println(filmarkiv);
		
		
		
		// Skriver ut samlingen
		//((Meny) filmarkiv).skriv();
//		Film(int filmnr, String produsent, String tittel, int årstall, String filmselskap) {
	}

}
