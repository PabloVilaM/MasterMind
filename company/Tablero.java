package com.company;

public class Tablero {
    private String cifraPista;
    private String cifraAleatorio;
    private String cifraSecuencia;
    private Tablero tablero = new Tablero();
    private Tablero(){

    }

    public String getCifraPista() {
        return cifraPista;
    }

    public void setCifraPista(String cifraPista) {
        this.cifraPista = cifraPista;
    }

    public String getCifraAleatorio() {
        return cifraAleatorio;
    }

    public void setCifraAleatorio(String cifraAleatorio) {
        this.cifraAleatorio = cifraAleatorio;
    }

    public String getCifraSecuencia() {
        return cifraSecuencia;
    }

    public void setCifraSecuencia(String cifraSecuencia) {
        this.cifraSecuencia = cifraSecuencia;
    }
}
