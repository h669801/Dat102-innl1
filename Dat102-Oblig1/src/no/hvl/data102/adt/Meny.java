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

	public void start() {
		// legg inn en del forhåndsdefinerte filmer for å teste metodene
		// TODO
		Film film1 = new Film ( 1, "Thomas", "film1", 1990, "Warner A", Sjanger.DOCUMENTARY); 
		filmarkiv.leggTilFilm(film1);
		
		Film film2 = new Film ( 2, "Thomas F", "film2", 1992, "Warner P" , Sjanger.ACTION);
		filmarkiv.leggTilFilm(film2);
		
		Film film3 = new Film ( 3, "Thomas A", "film3", 1996, "Warner Y", Sjanger.DRAMA);
		filmarkiv.leggTilFilm(film3);
		
		
//		tekstgr.skrivUtStatistikk(filmarkiv);
//		tekstgr.lesFilm();
//		tekstgr.visFilm(film3);
//		tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, "film1");
		tekstgr.skrivUtFilmProdusent(filmarkiv, "h");
		
//		System.out.println(film);
		
			
	}

}
