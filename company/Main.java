package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

          int Aleat = Funciones.generarAleatorio();
          String Aleato = Aleat + "";
        System.out.println(Aleat);
          for(int i=0;i<10;i++){
              String sec = Funciones.pedirSecuencia();
              if(Funciones.comprobarSecuencia(sec, Aleato) == true){
                  Funciones.mostrar("Ganaste");
                  break;
              }
              else{
                  Funciones.mostrarPista();
              }

          }
        Funciones.mostrar("Game over");
    }
}
