package com.lideratec.academy;

import java.util.ArrayList;
import java.util.List;

public class MathReconocimiento {

    public void operar(){
        System.out.println("Operaremos matematicamente");
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E); //Euler
        System.out.println("Valor absoluto de -25 es: " + Math.abs(-25));
    }

    public void obtenerArea(double radio){
        double area = Math.PI * radio * radio;

        System.out.println("Radio es: " + radio);
        System.out.println("El area es: " + area);
    }

    public void otrasOperaciones(double valor){
        System.out.println("Valor absoluto: " + Math.abs(valor));
        System.out.println("Raiz cubica : " + Math.cbrt(valor));
        System.out.println("Redondear superior " + Math.ceil(valor) );

        System.out.println("Redondear inferior " + Math.floor(valor));

        System.out.println("Elevar potencia " + Math.pow(valor,2));
        System.out.println("Angulo en radianar " + Math.toRadians(valor));

        System.out.println("Menor: " + Math.min(18,7));
        System.out.println("Mayor" + Math.max(18,7));

    }


    public int generarNumeroAleatorios(int min, int max){

        if( min > max){
            throw  new IllegalArgumentException("El numero minimo no puede mayor al maximo");
        }

        return (int)(Math.random() * (max - min + 1)) + min;

    }



    public int contarDigitos(int num){
        num = Math.abs(num);

        if(num ==0){
            return 1;
        }

        int contador =  0;

        while(num >0){
            contador++;
            num = num /10;
        }

        return contador;
    }


    public List<Integer> digitosNumeros(int num){
        num = Math.abs(num);

        List<Integer> digitos = new ArrayList<>();

        if(num ==0){
            digitos.add(0);
            return digitos;
        }

        int divisor = (int) Math.pow(10, contarDigitos(num) - 1);
        while(divisor > 0){
            digitos.add(num/divisor);
            num = num % divisor;
            divisor = divisor / 10;
        }

        return digitos;
    }

    public boolean esCapicua(int num){
        List<Integer> digitos = digitosNumeros(num);
        int izquierda = 0;
        int derecha = digitos.size() - 1;

        while(izquierda < derecha){
            if(!digitos.get(izquierda).equals(digitos.get(derecha))){
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
