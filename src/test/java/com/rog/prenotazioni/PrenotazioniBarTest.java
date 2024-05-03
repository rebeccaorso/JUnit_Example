package com.rog.prenotazioni;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrenotazioniBarTest {

    @Test
    public void tuttiTavoliLiberiAllaPartenza() {
        var prenotazioniBar = new PrenotazioniBar(3);
        assertEquals(3, prenotazioniBar.getTavoliLiberi());
    }

    @Test
    public void aggiuntaPrenotazioneDecrementaTavoliLiberi() throws NessunTavoloDisponibileException {
        var prenotazioniApp = new PrenotazioniBar(3);
        var tavoliLiberi = prenotazioniApp.getTavoliLiberi();
        try {
            prenotazioniApp.prenota("Principe Ben");
        } catch (NessunTavoloDisponibileException e) {
            throw new RuntimeException(e);
        }
        assertEquals(1, tavoliLiberi - prenotazioniApp.getTavoliLiberi());
    }
}
