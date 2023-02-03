package no.hvl.data102.adt;

import java.util.Scanner;
import no.hvl.data102.klient.*;
import no.hvl.data102.FilmArkiv;
import no.hvl.data102.*;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public class Tekstgrensesnitt {
	int antall;

	// lese opplysningene om en FILM fra tastatur
	public Film lesFilm() {
		// TODO
		Scanner scanner = new Scanner(System.in);

		System.out.println("filmnr :");
		int nr = scanner.nextInt();

		System.out.println("Produsent :");
		String produsent = scanner.nextLine();

		System.out.println("Tittel :");
		String tittel = scanner.nextLine();

		System.out.println("Årstall :");
		int aarstall = scanner.nextInt();

		System.out.println("Filmselskap :");
		String filmSelskap = scanner.nextLine();

		System.out.println("Sjanger :");
		Sjanger sjanger = Sjanger.valueOf(scanner.nextLine());

		Film film = new Film(nr, produsent, tittel, aarstall, filmSelskap, sjanger);
		return film;

	}

	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		// TODO
		
		System.out.println("filmnr : " + film.getFilmnr());
		System.out.println("Produsent : "+ film.getProdusent());
		System.out.println("Tittel : " +film.getTittel());
		System.out.println("Aarstall : " +film.getÅrstall());
		System.out.println("Filmselskap : " + film.getFilmselskap());
		System.out.println("Sjanger : " + film.getSjanger());
		System.out.println();
	}

	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
		// TODO
		
		Film[] filmer = filma.soekTittel(delstreng);
		for(int i = 0; i < filmer.length; i++) {
			visFilm(filmer[i]);
		}

	}

	// Skriver ut alle Filmer av en produsent / en gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		// TODO Denne gjør tilsvarende som metoden over
		Film[] filmer = filma.soekProdusent(delstreng);
		for(int i = 0; i < filmer.length; i++) {
			visFilm(filmer[i]);
		}

	}

	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
		// TODO

		int total = filma.antall();
		System.out.println("totalt antall filmer: " + total);

		int antallAction = filma.antall(Sjanger.ACTION);
		int antallDrama = filma.antall(Sjanger.DRAMA);
		int antallDokumentar = filma.antall(Sjanger.DOCUMENTARY);
		int antallHistorie = filma.antall(Sjanger.HISTORY);
		int antallScifi = filma.antall(Sjanger.SCIFI);

		System.out.println("Antall Action filmer: " + antallAction);
		System.out.println("Antall Drama filmer: " + antallDrama);
		System.out.println("Antall Dokumentar filmer: " + antallDokumentar);
		System.out.println("Antall Historie filmer: " + antallHistorie);
		System.out.println("Antall Scifi filmer: " + antallScifi);

		// ... Ev. andre metoder

	}
}
