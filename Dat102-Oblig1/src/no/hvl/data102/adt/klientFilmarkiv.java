package no.hvl.data102.adt;

import no.hvl.data102.klient.*;
import no.hvl.data102.adt.Tekstgrensesnitt;
import no.hvl.data102.adt.Meny;
import no.hvl.data102.*;

public class klientFilmarkiv {

	public static void main(String[] args) { 
		  FilmarkivADT filma = new FilmArkiv(100);  
		  Meny meny = new Meny(filma); 
		  meny.start();
		 } 
}
