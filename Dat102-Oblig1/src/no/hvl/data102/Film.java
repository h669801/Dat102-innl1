package no.hvl.data102;

public class Film {
	
	public int filmnr;
	public String produsent;
	public String tittel;
	public int årstall;
	public String filmselskap;
	
	public Film() {
		//this(filmnr, produsent,tittel,årstall, filmselskap);
		//filmnr = 1;
		//produsent = "test";
		//tittel = "wow";
		//årstall = 1900;
		//filmselskap = "sjukt";
	}
	
	public Film(int filmnr, String produsent, String tittel, int årstall, String filmselskap) {
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.årstall = årstall;
		this.filmselskap = filmselskap;
	}

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getÅrstall() {
		return årstall;
	}

	public void setÅrstall(int årstall) {
		this.årstall = årstall;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}
	
	@Override
	public boolean equals(Object andre) {
		if (this == andre) {
			return true;
		}
		if (andre == null) {
			return false;

		}
		if (getClass() != andre.getClass()) {
			return false;
		}
		Film denAndre = (Film) andre;
		boolean like = this.filmnr == denAndre.getFilmnr();
		return like;
	}
	
	@Override 
	public int hashCode() { 
	    Integer temp = nr; 
	    return temp.hashCode(); 
	} 

}
