package ba.unsa.etf.rs.tut5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;

class KorisnikTest {
    private static Korisnik korisnik = null;

    @BeforeAll
    @Test
    static void getImeTest(){
        String novoIme = "IME";
        korisnik.setIme(novoIme);
        assertEquals("Ime", korisnik.getIme());
    }



}