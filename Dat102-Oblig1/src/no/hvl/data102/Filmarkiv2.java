package no.hvl.data102;

import no.hvl.data102.klient.*;
import no.hvl.data102.Film;
import no.hvl.data102.LinearNode;
//import no.hvl.data102.Film;

public class Filmarkiv2 implements FilmarkivADT {
	private int antall;
	private LinearNode<Film> start;

	// Ingen referanse til siste, kun start

	/*
	 * Klassen skal ha de samme operasjoner som for Filmarkiv i øving 2, men pass på
	 * at implementeringen av alle metoder blir tilpasset den nye strukturen.
	 */

	public Filmarkiv2() {
		antall = 0;
		start = null;
	}

//	private void utvid() {
//		FilmArkiv[] nyTabell = (FilmArkiv[]) (new Object[film.length * 2]);
//		for (int i = 0; i < film.length; i++) {
//			nyTabell[i] = film[i];
//		}
//		
//		Film[] hjelpetabell = (Film[]) (new Object[koe.length * 2]);
//		int gmlLengde = koe.length;
//		for (int i = 0; i < gmlLengde - 1; i++) {
//			hjelpetabell[i] = koe[foran];
//			foran = (foran + 1) % koe.length;
//		}
//		foran = 0;
//		bak = gmlLengde - 2;
//		koe = hjelpetabell;
//		// return nyTabell;
//	}

	@Override
	public Film finnFilm(int nr) {
		// TODO Auto-generated method stub
		LinearNode<Film> aktuell = start;
		
		for (int i = 0; i < antall; i++) {
		      if (aktuell.getElement().getFilmnr() == nr) {
		    	  Film film = aktuell.getElement();
		        return film;
		      }
		}
		
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> node = new LinearNode<>(nyFilm);
		node = start.getNeste();
		start = node;
		antall++;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub

		LinearNode<Film> current = start;
		LinearNode<Film> previous = null;

		while (current != null) {
			antall++;
			if (antall == filmnr) {
				if (previous == null) {
					start = current.getNeste();
				} else {
					previous.setNeste(current.getNeste());
				}
				antall--;
				// film slettet
				return true;
			}
			previous = current;
			current = current.getNeste();
		}
		// film ikke funnet
		return false;

	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		LinearNode<Film> aktuell = start;
		LinearNode<Film> resultat = new LinearNode<>();

		while (aktuell != null) {
			if (aktuell.getElement().getTittel().toLowerCase().contains(delstreng.toLowerCase())) {
				resultat.setElement(aktuell.getElement());
			}
			aktuell = aktuell.getNeste();
		}

		Film[] filmer = new Film[antall];
		for (int i = 0; i < antall; i++) {
			filmer[i] = resultat.getElement();
		}

		return filmer;	

	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		// TODO Auto-generated method stub
		
		LinearNode<Film> aktuell = start;
		LinearNode<Film> resultat = new LinearNode<>();

		while (aktuell != null) {
			if (aktuell.getElement().getTittel().toLowerCase().contains(delstreng.toLowerCase())) {
				resultat.setElement(aktuell.getElement());
			}
			aktuell = aktuell.getNeste();
		}

		Film[] filmer = new Film[antall];
		for (int i = 0; i < antall; i++) {
			filmer[i] = resultat.getElement();
		}

		return filmer;
		
//		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		LinearNode<Film> aktuell = start;
		
		for (int i = 0; i < antall; i++) {
		      if (aktuell.getElement().getSjanger() == sjanger) {
		        antall++;
		      }
		    }
		return antall;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		for(int i = 0; i < antall; i++) {
			
		}
		
		return antall;
	}

}
