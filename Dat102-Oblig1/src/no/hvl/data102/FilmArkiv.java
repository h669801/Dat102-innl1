package no.hvl.data102;

public interface FilmArkiv {

	Film finnFilm(int nr);
	if(nr == filmnr) {
		return Film();
	}
	
    void leggTilFim(Film nyFilm);
	
	
	boolean slettFilm(int filmnr);
	
	
	Film[] soekTittel(String delstreng);
	
	
	Film[] soekProdusent(String delstreng);
	
	
	int antall(Sjanger sjanger); 
	 
	 /** 
	  *  
	  * @return antall filmer i arkivet 
	  */ 
	 int antall();

}
