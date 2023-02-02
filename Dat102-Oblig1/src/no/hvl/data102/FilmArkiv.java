package no.hvl.data102;

import no.hvl.data102.adt.*;
import no.hvl.data102.Film;
import no.hvl.data102.klient.FilmarkivADT;

public class FilmArkiv implements FilmarkivADT{

	private static final int KAPASITET = 100;
	private int antall;
	private Film[] film;

	public FilmArkiv() {
		this(KAPASITET);
	}

	/**
	 * 
	 * @param lengde oppgir hvor mye plass der er til filmer i tabellen
	 */

	public FilmArkiv(int lengde) {
		// FilmArkiv arkiv = arkiv.length[antall];
		
		antall = 0;
//		film = (Film[]) (new Object[lengde]);
		film = new Film[lengde];
		if (film.length == antall) {
			utvid();
		}
	}

	private void utvid() {
		Film[] nyTabell = (Film[]) (new Object[film.length * 2]);
		for (int i = 0; i < film.length; i++) {
			nyTabell[i] = film[i];
		}
		//return nyTabell;
	}

	@Override
	public Film finnFilm(int nr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < antall; i++) {
		      if (film[i].getFilmnr() == nr) {
		        return film[i];
		      }
		}
		return null;
	}
	

	@Override
	public void leggTilFilm(Film nyFilm) {
		// TODO Auto-generated method stub
		
//		FilmArkiv[] film = new FilmArkiv[nyFilm];
		if (antall < film.length) {
			film[antall] = nyFilm;
			antall++;
		}
	}

	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < antall; i++) {
		      if (film[i].getFilmnr() == filmnr) {
		        for (int j = i; j < antall - 1; j++) {
		          film[j] = film[j + 1];
		        }
		        film[antall - 1] = null;
		        antall--;
		        return true;
		      }
		    }
		
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < antall; i++) {
			if(film[i].getTittel().contains(delstreng)) {
				
				return film;
			}
		}
		
		return null;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < antall; i++) {
			if(film[i].getProdusent().contains(delstreng)) {
				return film;
			}
		}
		
		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < antall; i++) {
		      if (film[i].getSjanger() == sjanger) {
		        count++;
		      }
		    }
		return count;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < antall; i++) {
			count++;
		}
		return count;
	}
}
