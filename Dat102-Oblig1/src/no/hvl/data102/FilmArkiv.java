package no.hvl.data102;

import no.hvl.data102.adt.*;
import no.hvl.data102.klient.FilmarkivADT;

public class FilmArkiv implements FilmarkivADT{

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

	@Override
	public Film finnFilm(int nr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		// TODO Auto-generated method stub
		
		return soekProdusent(delstreng);
	}

	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return antall(sjanger);
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return antall;
	}
}
