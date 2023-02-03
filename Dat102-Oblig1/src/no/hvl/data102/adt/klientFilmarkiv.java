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
//		  Tekstgrensesnitt t = new Tekstgrensesnitt(100);
//		  Film[] f = filma.soekProdusent("h");
//		  System.out.println(f);
//		  System.out.println(meny.toString());
//		  System.out.println(filma.soekTittel("f"));
//		  System.out.println(filma.finnFilm(1).getTittel());
//		  System.out.println(skrivUtStatistikk(filma));
//		  System.out.println(filma.finnFilm(1).filmselskap);
		  
//		  for (int i = 1; i < 100; i++) {
//		      System.out.println("Filmnr : " + filma.finnFilm(i).getFilmnr());
//		      System.out.println("Produsent : " + filma.finnFilm(i).getProdusent());
//		      System.out.println("Tittel : " + filma.finnFilm(i).getTittel());
//		      System.out.println("Aarstall : " + filma.finnFilm(i).getÅrstall());
//		      System.out.println("Filmselskap : " + filma.finnFilm(i).getFilmselskap());
//		      System.out.println("Sjanger : " + filma.finnFilm(i).getSjanger());
//		      System.out.println();
//		    }
//		  System.out.println(skrivUtFilmDelstrengITittel())
//		  skrivUtFilmDelStrengITittel(filma,"f");
		  
//		  System.out.println();
		 } 

}
