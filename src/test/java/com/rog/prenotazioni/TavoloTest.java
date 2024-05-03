package com.rog.prenotazioni;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TavoloTest {

    @Test
    public void tavoloNuovoDeveEssereDisponibile() {
        var tavolo = new Tavolo();
        assertEquals(true, tavolo.isDisponibile());
    }

    @Test
    public void tavoloPrenotatoNonDeveEssereDisponibile() {
        var tavolo = new Tavolo();
        tavolo.prenotaPer("Maia");
        assertEquals(false, tavolo.isDisponibile());
    }

    @Test
    public void tavoloPrenotatoELiberatoDeveEssereDisponibile() {
        var tavolo = new Tavolo();
        tavolo.prenotaPer("Maia");
        tavolo.libera();
        assertEquals(true, tavolo.isDisponibile());
    }


    @Test
    public void PrenotaPer() {
    }

    @Test
    public void GetNominativo() {
    }
}