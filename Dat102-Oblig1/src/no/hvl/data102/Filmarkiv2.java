package no.hvl.data102;

import no.hvl.data102.klient.*;

public class Filmarkiv2 implements FilmarkivADT{ 
    private int antall; 
    private LinearNode<Film> start;
	
	
    // Ingen referanse til siste, kun start 
     
    /*  Klassen skal ha de samme operasjoner som for Filmarkiv i 
        øving 2, men pass på at implementeringen av alle metoder  
        blir tilpasset den nye strukturen. */ 
    
    
    public Filmarkiv2() {
		// FilmArkiv arkiv = arkiv.length[antall];
		utvid();
		antall = 0;
		start = null;
	}

	/**
	 * @return returnerer antall filmer
	 */
	public int getAntall() {
		return antall;
	}

	/**
	 * @return returnerer tabellen
	 */
//	public FilmArkiv[] getFilm() {
//		return Film;
//	}

	private void utvid() {
		FilmArkiv[] nyTabell = (FilmArkiv[]) (new Object[film.length * 2]);
		for (int i = 0; i < film.length; i++) {
			nyTabell[i] = film[i];
		}
		//return nyTabell;
	}
    
    
} 
