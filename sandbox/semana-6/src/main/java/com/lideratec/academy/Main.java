package com.lideratec.academy;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MathReconocimiento math = new MathReconocimiento();

        //math.obtenerArea(5.0);

        int aleatorio = math.generarNumeroAleatorios(5,20);
        System.out.println("El numero aleatiro es:" + aleatorio);


        List<Integer> numero = math.digitosNumeros(500);
        System.out.println("numero: " + numero);


        boolean esCapicua = math.esCapicua(500);
        System.out.println("es capicua: " + esCapicua);


        System.out.println(Math.abs(-125));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.min(9,5));
        System.out.println(Math.max(9,5));




    }
}

