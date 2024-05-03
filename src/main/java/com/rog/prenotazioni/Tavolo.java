package com.rog.prenotazioni;

public class Tavolo {

    private String nominativo;

    public boolean isDisponibile() {
        return nominativo == null || nominativo.length() ==0;
    }

    public void prenotaPer(String nominativo) {
        this.nominativo = nominativo;
    }

    public void libera(){
        nominativo = null;
    }

    public String getNominativo() {
        return nominativo;
    }

}
