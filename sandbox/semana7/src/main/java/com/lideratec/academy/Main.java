package com.lideratec.academy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*String mensaje = "Hola profesor, bienvenido a ISIL";
        System.out.println(mensaje.length());
        System.out.println(mensaje.charAt(0));

        System.out.println(mensaje.contains("ISIL"));

        System.out.println(mensaje.indexOf("ISIL"));

        System.out.println(mensaje.substring(0,4));

        System.out.println(mensaje.toUpperCase());

        System.out.println(mensaje.toLowerCase());*/

        ProCadenas cadena = new ProCadenas();
        System.out.println(cadena.invertirCadenas("hola"));

        System.out.println(cadena.cuentaOcurrenciasExisten("querido profesor te quiero", 'l'));


        System.out.println(cadena.posicionSubcadena("querido profesor lo quiero", "amo"));


        System.out.println(cadena.extraeSubcadena("Anita lava la tina", 6,4));

        System.out.println(cadena.esPalindromo("Anita lava la tina"));

        System.out.println(cadena.esPalindromo("Hola profesor"));
    }


}