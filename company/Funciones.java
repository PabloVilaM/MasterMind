package com.company;


import javax.swing.*;

public  class Funciones {
    private static String pista = "";
    public static int generarAleatorio() {
         double rand = Math.random()*100000+10000;
         int rand2 = (int) rand;
        return rand2;
    }

    public static void mostrar(String mensa) {
        System.out.println(mensa);
    }

    public static String pedirSecuencia() {
        String sec = JOptionPane.showInputDialog("Dame una secuencia");
        return sec;
    }

    public static Boolean comprobarSecuencia(String sec, String Aleato) {
        int i = 0;
        boolean opt = false;
        pista="";
        for (i = 0; i < 5; i++) {
            String charToString = String.valueOf(sec.charAt(i));
            if (sec.charAt(i) == Aleato.charAt(i)) {
                pista += "0";
            } else if (sec.charAt(i) != Aleato.charAt(i) && Aleato.contains(charToString)) {
                pista += "X";
            } else {
                pista += "-";
            }

        }
        if (pista.equals("00000")) {
            opt = true;
            return opt;
        }
        else{
            return opt;
        }
    }


    public static void mostrarPista() {
        System.out.println(pista);
    }
}
