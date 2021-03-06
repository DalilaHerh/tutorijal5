package ba.unsa.etf.rs.tut5;

import javafx.beans.property.SimpleObjectProperty;

import javafx.collections.FXCollections;

import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnik = FXCollections.observableArrayList();
    private SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<>();

    public ObservableList<Korisnik> getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(ObservableList<Korisnik> korisnik) {
        this.korisnik = korisnik;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void dodajKorisnika() {
        korisnik.add(new Korisnik());
    }

    void napuni (){
        korisnik.add(new Korisnik( "Dalila" , "Herh" , " dherh1@etf.unsa.ba" , "dherh1", "password"));
        korisnik.add(new Korisnik( "Tarik" , "Sijarcic" , " tsijarcic1@etf.unsa.ba" , "tsijercic1", "lozinka"));
        korisnik.add(new Korisnik());
    }
}