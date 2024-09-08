package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        Random random=new Random();

        String[] opciones= {"piedra","papel","tijera"};
        final int rondas=3;
        int rondasGanadasJugador=0;
        int rondasGanadasConsola=0;

        System.out.println("bienvenidos a piedra papel y tijera");
        System.out.println("tienes tres intentos");

        for (int i = 1; i <= rondas; i++) {
            System.out.println("\nRonda " + i + ":");
            System.out.print("Elige piedra, papel o tijera: ");
            String eleccionUsuario = leer.nextLine().toLowerCase();}

        while (!esOpcionValida(eleccionUsuario)) {
            System.out.print("Opción inválida. Elige piedra, papel o tijera: ");
            eleccionUsuario = leer.nextLine().toLowerCase();



    }
}