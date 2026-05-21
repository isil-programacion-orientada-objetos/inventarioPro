package com.lideratec.academy;

public class ProCadenas {

    public String invertirCadenas(String cadena){

        String cadenaInvertida = "";
        for(int indice=cadena.length()-1; indice >=0; indice--){
            cadenaInvertida +=cadena.charAt(indice);

        }

        return cadenaInvertida;
    }

    public int cuentaOcurrenciasExisten(String cadena, char caracter){
        int totalOcurrencias = 0;
        for(int indice =0; indice <= cadena.length()-1; indice++){
            if(cadena.charAt(indice) == caracter){
                totalOcurrencias++;
            }
        }

        return totalOcurrencias;
    }


    public int posicionSubcadena(String cadena, String subcadena){
        return cadena.indexOf(subcadena);

    }


    public String extraeSubcadena(String cadena, int posicionInicial, int cantCaracteres){
        String subcadena = cadena.substring(posicionInicial, posicionInicial + cantCaracteres);
        return subcadena;
    }


    public boolean esPalindromo(String cadena){
        String cadenaSinBlanco = "";
        char caracter;

        for( int indice = cadena.length()-1; indice >=0; indice--){
            if(cadena.charAt(indice) != '\u0020'){
                cadenaSinBlanco += cadena.charAt(indice);
            }
        }

        String cadenaInvertida = invertirCadenas(cadenaSinBlanco);
        if(cadenaSinBlanco.equalsIgnoreCase(cadenaInvertida)){
            return true;
        }else{
            return false;
        }

    }


    // Extraer de una cadena una subcadena y invertirla y devolverla, que haria?

}
