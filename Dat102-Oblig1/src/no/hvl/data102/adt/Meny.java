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
		Film film1 = new Film ( 1, "Martin Scorese", "Goodfellas", 1990, "Warner Brothers", Sjanger.DOCUMENTARY); 
		filmarkiv.leggTilFilm(film1);
		
		Film film2 = new Film ( 2, "Quentin Tarantino", "Inglorius Bastards", 2009, "Sony Studio" , Sjanger.ACTION);
		filmarkiv.leggTilFilm(film2);
		
		Film film3 = new Film ( 3, "Christopher Nolan", "Inception", 2010, "Sky Studio", Sjanger.DRAMA);
		filmarkiv.leggTilFilm(film3);
		
		
//		tekstgr.skrivUtStatistikk(filmarkiv);
//		tekstgr.lesFilm();
//		tekstgr.visFilm(film3);
		tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, "In");
//		tekstgr.skrivUtFilmProdusent(filmarkiv, "h");
		
//		System.out.println(film);
		
			
	}

}
