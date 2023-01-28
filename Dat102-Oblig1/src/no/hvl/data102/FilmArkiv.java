package no.hvl.data102;

import no.hvl.data102.adt.*;

public class FilmArkiv {

	private static final int KAPASITET = 100;
	private int antall;
	private FilmArkiv[] film;

	public FilmArkiv() {
		this(KAPASITET);
	}

	/**
	 * 
	 * @param lengde oppgir hvor mye plass der er til filmer i tabellen
	 */

	public FilmArkiv(int lengde) {
		// FilmArkiv arkiv = arkiv.length[antall];
		utvid();
		antall = 0;
		film = (FilmArkiv[]) (new Object[lengde]);
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
	public FilmArkiv[] getFilm() {
		return film;
	}

	private void utvid() {
		FilmArkiv[] nyTabell = (FilmArkiv[]) (new Object[film.length * 2]);
		for (int i = 0; i < film.length; i++) {
			nyTabell[i] = film[i];
		}
		//return nyTabell;
	}
}
