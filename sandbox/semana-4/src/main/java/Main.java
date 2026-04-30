public class Main {
    public static void main(String[] args) {

        int notaFinal = 18;

        if( notaFinal>=18){
            System.out.println("Estas aprobado y con beca");
        }else if(notaFinal>=14){
            System.out.println("Estas aprobado");
        }
        else if(notaFinal >=12){
            System.out.println("Aprobo a las justas");
        }
        else{
            System.out.println("Estas desaprobado");
        }

        int opcion = 1;
        switch (opcion){
            case 1:
                System.out.println("registrar");
                break;
            case 2:
                System.out.println("Consultar");
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Esa opcion no existe");
        }


        int contador = 6;
        int sumador= 0;

        /*while(contador <= 5){
            sumador += contador;
            System.out.println(sumador);
            contador++;
        }

        do{
            System.out.println("Etoy iniciando mi proceso de recorrido");
            contador++;
        }while(contador<=5);

*/

        for(int i = 1 ; i<=5; i++){

            if( i==3){
                continue;
            }
            System.out.println(i);
        }


        String nombre = "Wilder";

        if(nombre.equals("Wilder")){
            System.out.println("Es mi querido profesor");
        }else{
            System.out.println("El no es mi querido profesor");
        }
    }
}